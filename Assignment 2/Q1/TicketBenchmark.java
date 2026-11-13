public class TicketBenchmark {

    public static void main(String[] args) {

        int fields = 10000;

        // Method 1: Using String concatenation
        long start1 = System.nanoTime();

        String ticket1 = "";

        for (int i = 0; i < fields; i++) {
            ticket1 = ticket1 + "Ticket" + i;
        }

        long end1 = System.nanoTime();

        // Method 2: Using StringBuilder
        long start2 = System.nanoTime();

        StringBuilder ticket2 = new StringBuilder();

        for (int i = 0; i < fields; i++) {
            ticket2.append("Ticket").append(i);
        }

        long end2 = System.nanoTime();

        // Method 3: Using StringBuffer
        long start3 = System.nanoTime();

        StringBuffer ticket3 = new StringBuffer();

        for (int i = 0; i < fields; i++) {
            ticket3.append("Ticket").append(i);
        }

        long end3 = System.nanoTime();

        System.out.println("String Time: " + (end1 - start1) + " nanoseconds");
        System.out.println("StringBuilder Time: " + (end2 - start2) + " nanoseconds");
        System.out.println("StringBuffer Time: " + (end3 - start3) + " nanoseconds");

        System.out.println("All three methods executed successfully.");
    }
}
