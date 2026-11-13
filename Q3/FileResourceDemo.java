
import java.io.*;

public class FileResourceDemo {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        // Create a sample file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Java Resource Management\n");
            writer.write("Try-with-resources example\n");
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("File creation error: " + e.getMessage());
        }

        // Read file using try-with-resources
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;
            System.out.println("\nFile Contents:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File reading error: " + e.getMessage());
        }

        System.out.println("\nResources closed automatically.");
    }
}
