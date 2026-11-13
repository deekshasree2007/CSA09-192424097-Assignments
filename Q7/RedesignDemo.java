
public class RedesignDemo {

    static String originalSolution(int fields) {
        String ticket = "";

        for (int i = 0; i < fields; i++) {
            ticket = ticket + "Ticket" + i;
        }

        return ticket;
    }

    static String redesignedSolution(int fields) {
        StringBuilder ticket = new StringBuilder(fields * 12);

        for (int i = 0; i < fields; i++) {
            ticket.append("Ticket").append(i);
        }

        return ticket.toString();
    }

    public static void main(String[] args) {

        int fields = 10000;
        int repetitions = 5;

        long originalTotal = 0;
        long redesignedTotal = 0;

        // Warm-up
        for (int i = 0; i < 3; i++) {
            originalSolution(fields);
            redesignedSolution(fields);
        }

        System.out.println("Q7 REDESIGN COMPARISON");

        for (int i = 1; i <= repetitions; i++) {

            long start = System.nanoTime();
            String oldResult = originalSolution(fields);
            long originalTime = System.nanoTime() - start;

            start = System.nanoTime();
            String newResult = redesignedSolution(fields);
            long redesignedTime = System.nanoTime() - start;

            if (!oldResult.equals(newResult)) {
                System.out.println("Output mismatch!");
                return;
            }

            originalTotal += originalTime;
            redesignedTotal += redesignedTime;

            System.out.println("Run " + i);
            System.out.println("Original: " + originalTime + " ns");
            System.out.println("Redesigned: " + redesignedTime + " ns");
        }

        System.out.println("Average Original: "
                + originalTotal / repetitions + " ns");

        System.out.println("Average Redesigned: "
                + redesignedTotal / repetitions + " ns");

        System.out.println("Both solutions produced identical output.");
    }
}
