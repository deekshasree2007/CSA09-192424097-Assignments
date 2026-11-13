
class CinemaHall {

    private boolean seatBooked = false;

    public synchronized void bookSeat(String customer) {

        if (!seatBooked) {
            System.out.println(customer + " is booking the seat.");

            seatBooked = true;

            System.out.println(customer + " booked the seat successfully.");
        } else {
            System.out.println(customer + ": Seat is already booked.");
        }
    }
}

public class CinemaBooking {

    public static void main(String[] args) {

        CinemaHall hall = new CinemaHall();

        Thread t1 = new Thread(() -> hall.bookSeat("Customer A"));
        Thread t2 = new Thread(() -> hall.bookSeat("Customer B"));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
            Thread.currentThread().interrupt();
        }

        System.out.println("Booking process completed.");
    }
}
