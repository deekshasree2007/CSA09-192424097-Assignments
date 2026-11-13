# Q4 – Performance Analysis and Observations

## 1. Aim

To compare HashMap, TreeMap and LinkedHashMap based on ordering, lookup and insertion performance.

## 2. Observations

- HashMap does not guarantee the order of entries.
- TreeMap automatically sorts entries according to their keys.
- LinkedHashMap maintains insertion order.
- All three maps successfully retrieved the medicine associated with ID 102.
- HashMap and LinkedHashMap generally provide average O(1) lookup.
- TreeMap provides O(log n) lookup.

## 3. Performance Comparison

| Map | Average Lookup Complexity | Ordering |
|---|---|---|
| HashMap | O(1) | No guaranteed order |
| TreeMap | O(log n) | Sorted order |
| LinkedHashMap | O(1) | Insertion order |

## 4. Design Decision

For the pharmacy inventory application, HashMap is suitable for fast medicine searches. TreeMap is useful for sorted inventory reports, while LinkedHashMap is useful when insertion order must be preserved.

## 5. Conclusion

The experiment demonstrates that the three Map implementations have different ordering and performance characteristics. The appropriate implementation should be selected according to application requirements.

Note: The current program verifies functionality and ordering. It does not provide a large-scale performance benchmark, so no measured speed comparison is claimed.# Q4 – Performance Analysis and Observations

## 1. Aim

To compare HashMap, TreeMap and LinkedHashMap based on ordering, lookup and insertion performance.

## 2. Observations

- HashMap does not guarantee the order of entries.
- TreeMap automatically sorts entries according to their keys.
- LinkedHashMap maintains insertion order.
- All three maps successfully retrieved the medicine associated with ID 102.
- HashMap and LinkedHashMap generally provide average O(1) lookup.
- TreeMap provides O(log n) lookup.

## 3. Performance Comparison

| Map | Average Lookup Complexity | Ordering |
|---|---|---|
| HashMap | O(1) | No guaranteed order |
| TreeMap | O(log n) | Sorted order |
| LinkedHashMap | O(1) | Insertion order |

## 4. Design Decision

For the pharmacy inventory application, HashMap is suitable for fast medicine searches. TreeMap is useful for sorted inventory reports, while LinkedHashMap is useful when insertion order must be preserved.

## 5. Conclusion

The experiment demonstrates that the three Map implementations have different ordering and performance characteristics. The appropriate implementation should be selected according to application requirements.

Note: The current program verifies functionality and ordering. It does not provide a large-scale performance benchmark, so no measured speed comparison is claimed.