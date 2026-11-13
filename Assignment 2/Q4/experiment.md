# Q4 – Experiment Procedure

## 1. Aim

To study and compare HashMap, TreeMap and LinkedHashMap in a pharmacy inventory application.

## 2. Software Requirements

- Java
- Visual Studio Code
- Java Compiler

## 3. Procedure

1. Created PharmacyInventory.java.
2. Created HashMap, TreeMap and LinkedHashMap objects.
3. Inserted medicine IDs and medicine names.
4. Copied records into TreeMap to observe sorted key order.
5. Inserted records into LinkedHashMap in a specific order.
6. Displayed the contents of all three maps.
7. Searched for medicine ID 102.
8. Compared the ordering and lookup behaviour.

## 4. Observations

TreeMap displayed entries in sorted key order. LinkedHashMap preserved the insertion order. HashMap did not guarantee a particular order.

All three maps successfully retrieved the medicine name associated with ID 102.

## 5. Result

The experiment successfully demonstrated the differences between HashMap, TreeMap and LinkedHashMap.

## 6. Conclusion

Each Map implementation is useful for different application requirements, such as fast lookup, sorted records and insertion-order preservation.