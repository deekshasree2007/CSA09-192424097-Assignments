# Q4 – Comparison of HashMap, TreeMap and LinkedHashMap

## 1. Introduction

Java provides different Map implementations to store data in key-value pairs. HashMap, TreeMap and LinkedHashMap differ in ordering and performance.

## 2. HashMap

- Stores data as key-value pairs.
- Does not guarantee insertion order.
- Allows one null key and multiple null values.
- Provides average O(1) lookup, insertion and deletion.

## 3. TreeMap

- Stores entries in sorted key order.
- Does not allow null keys with natural ordering.
- Provides O(log n) lookup, insertion and deletion.
- Useful when sorted data is required.

## 4. LinkedHashMap

- Maintains insertion order by default.
- Allows one null key and multiple null values.
- Provides average O(1) lookup, insertion and deletion.
- Useful when predictable iteration order is required.

## 5. Comparison Table

| Feature | HashMap | TreeMap | LinkedHashMap |
|---|---|---|---|
| Ordering | No guaranteed order | Sorted by key | Insertion order |
| Lookup | Average O(1) | O(log n) | Average O(1) |
| Insertion | Average O(1) | O(log n) | Average O(1) |
| Null key | One allowed | Not with natural ordering | One allowed |
| Structure | Hash table | Red-Black tree | Hash table + linked list |

## 6. Pharmacy Inventory Application

For a pharmacy inventory:

- HashMap is suitable for fast medicine ID searches.
- TreeMap is suitable when medicine records must be displayed in sorted ID order.
- LinkedHashMap is suitable when records must retain their insertion order.

## 7. Conclusion

All three Map implementations store key-value pairs, but their ordering and performance characteristics differ. The choice depends on the application's requirements.