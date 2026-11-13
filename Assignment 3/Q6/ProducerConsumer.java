
import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {

    private Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 3;

    public synchronized void produce(int value)
            throws InterruptedException {

        while (buffer.size() == capacity) {
            wait();
        }

        buffer.add(value);
        System.out.println("Produced: " + value);

        notifyAll();
    }

    public synchronized void consume()
            throws InterruptedException {

        while (buffer.isEmpty()) {
            wait();
        }

        int value = buffer.remove();
        System.out.println("Consumed: " + value);

        notifyAll();
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {

        SharedBuffer shared = new SharedBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    shared.produce(i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    shared.consume();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Producer-Consumer process completed.");
    }
}
