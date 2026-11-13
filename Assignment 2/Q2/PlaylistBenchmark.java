import java.util.*;

public class PlaylistBenchmark {

    public static void main(String[] args) {

        int size = 10000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
            arrayDeque.addLast(i);
        }

        // 1. Add at beginning
        long start = System.nanoTime();
        arrayList.add(0, -1);
        long arrayInsert = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.addFirst(-1);
        long linkedInsert = System.nanoTime() - start;

        start = System.nanoTime();
        arrayDeque.addFirst(-1);
        long dequeInsert = System.nanoTime() - start;

        // 2. Access middle element
        start = System.nanoTime();
        int a = arrayList.get(size / 2);
        long arrayAccess = System.nanoTime() - start;

        start = System.nanoTime();
        int b = linkedList.get(size / 2);
        long linkedAccess = System.nanoTime() - start;

        // 3. Remove first element
        start = System.nanoTime();
        arrayList.remove(0);
        long arrayRemove = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.removeFirst();
        long linkedRemove = System.nanoTime() - start;

        start = System.nanoTime();
        arrayDeque.removeFirst();
        long dequeRemove = System.nanoTime() - start;

        // 4. Iteration
        long sum = 0;

        start = System.nanoTime();
        for (int value : arrayList) sum += value;
        long arrayIteration = System.nanoTime() - start;

        start = System.nanoTime();
        for (int value : linkedList) sum += value;
        long linkedIteration = System.nanoTime() - start;

        start = System.nanoTime();
        for (int value : arrayDeque) sum += value;
        long dequeIteration = System.nanoTime() - start;

        System.out.println("OPERATION          ArrayList   LinkedList   ArrayDeque");
        System.out.println("Insert First       " + arrayInsert + "   " + linkedInsert + "   " + dequeInsert);
        System.out.println("Access Middle      " + arrayAccess + "   " + linkedAccess + "   Not Supported");
        System.out.println("Remove First       " + arrayRemove + "   " + linkedRemove + "   " + dequeRemove);
        System.out.println("Iteration          " + arrayIteration + "   " + linkedIteration + "   " + dequeIteration);

        System.out.println("Benchmark completed successfully.");
    }
}
