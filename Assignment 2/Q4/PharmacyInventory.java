
import java.util.*;

public class PharmacyInventory {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        hashMap.put(103, "Paracetamol");
        hashMap.put(101, "Vitamin C");
        hashMap.put(102, "Cetirizine");

        treeMap.putAll(hashMap);

        linkedHashMap.put(103, "Paracetamol");
        linkedHashMap.put(101, "Vitamin C");
        linkedHashMap.put(102, "Cetirizine");

        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        int searchId = 102;

        System.out.println("HashMap Search: " + hashMap.get(searchId));
        System.out.println("TreeMap Search: " + treeMap.get(searchId));
        System.out.println("LinkedHashMap Search: " + linkedHashMap.get(searchId));
    }
}
