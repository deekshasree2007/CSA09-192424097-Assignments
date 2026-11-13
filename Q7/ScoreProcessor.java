
import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;

public class ScoreProcessor {

    static class ScoreResult {
        String fileName;
        double score;
        boolean successful;
        String message;

        ScoreResult(String fileName, double score,
                    boolean successful, String message) {
            this.fileName = fileName;
            this.score = score;
            this.successful = successful;
            this.message = message;
        }
    }

    static class ScoreTask implements Callable<ScoreResult> {

        private Path file;

        ScoreTask(Path file) {
            this.file = file;
        }

        public ScoreResult call() {
            try {
                String content = Files.readString(file).trim();
                double score = Double.parseDouble(content);

                if (score < 0 || score > 100) {
                    throw new IllegalArgumentException(
                        "Score must be between 0 and 100"
                    );
                }

                return new ScoreResult(
                    file.getFileName().toString(),
                    score, true, "Processed successfully"
                );

            } catch (Exception e) {
                return new ScoreResult(
                    file.getFileName().toString(),
                    0, false, e.getMessage()
                );
            }
        }
    }

    static void createSampleFiles() throws IOException {

        Path folder = Paths.get("scores");
        Files.createDirectories(folder);

        Files.writeString(folder.resolve("student1.txt"), "85");
        Files.writeString(folder.resolve("student2.txt"), "92");
        Files.writeString(folder.resolve("student3.txt"), "76");
        Files.writeString(folder.resolve("student4.txt"), "invalid");
        Files.writeString(folder.resolve("student5.txt"), "105");
    }

    static void processFiles(int poolSize) throws Exception {

        List<Path> files = new ArrayList<>();

        try (DirectoryStream<Path> stream =
                 Files.newDirectoryStream(Paths.get("scores"), "*.txt")) {
            for (Path file : stream) {
                files.add(file);
            }
        }

        ExecutorService executor =
            Executors.newFixedThreadPool(poolSize);

        long start = System.nanoTime();

        try {
            List<Future<ScoreResult>> futures = new ArrayList<>();

            for (Path file : files) {
                futures.add(executor.submit(new ScoreTask(file)));
            }

            double total = 0;
            int success = 0;
            int failed = 0;

            System.out.println("\nThread Pool Size: " + poolSize);

            for (Future<ScoreResult> future : futures) {
                ScoreResult result = future.get();

                if (result.successful) {
                    System.out.println(result.fileName
                        + " : " + result.score + " - "
                        + result.message);
                    total += result.score;
                    success++;
                } else {
                    System.out.println(result.fileName
                        + " : FAILED - " + result.message);
                    failed++;
                }
            }

            long end = System.nanoTime();

            System.out.println("Successful files: " + success);
            System.out.println("Failed files: " + failed);

            if (success > 0) {
                System.out.println("Average score: "
                    + (total / success));
            }

            System.out.println("Execution time: "
                + (end - start) + " ns");

        } finally {
            executor.shutdown();
        }
    }

    public static void main(String[] args) throws Exception {

        createSampleFiles();

        int[] poolSizes = {1, 2, 4, 8};

        for (int size : poolSizes) {
            processFiles(size);
        }

        System.out.println("\nAll processing completed.");
    }
}
