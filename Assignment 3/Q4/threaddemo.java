
class TicketBooking extends Thread {

    private String stationName;

    TicketBooking(String name) {
        stationName = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(stationName + " processing ticket " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println(stationName + " completed.");
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        TicketBooking t1 = new TicketBooking("Station A");
        TicketBooking t2 = new TicketBooking("Station B");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
            Thread.currentThread().interrupt();
        }

        System.out.println("All ticket bookings completed.");
    }
}
