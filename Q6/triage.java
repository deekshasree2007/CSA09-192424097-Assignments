
import java.util.*;

class Patient {
    String name;
    int severity;
    int arrivalOrder;

    Patient(String name, int severity, int arrivalOrder) {
        this.name = name;
        this.severity = severity;
        this.arrivalOrder = arrivalOrder;
    }

    public String toString() {
        return name + "(S" + severity + ")";
    }
}

public class Triage {
    public static void main(String[] args) {

        PriorityQueue<Patient> queue = new PriorityQueue<>(
            Comparator.comparingInt((Patient p) -> p.severity)
                      .thenComparingInt(p -> p.arrivalOrder)
        );

        queue.add(new Patient("Ravi", 3, 1));
        queue.add(new Patient("Meena", 1, 2));
        queue.add(new Patient("John", 3, 3));
        queue.add(new Patient("Asha", 5, 4));
        queue.add(new Patient("Kumar", 1, 5));
        queue.add(new Patient("Lata", 2, 6));

        System.out.println("PATIENT TREATMENT ORDER");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
