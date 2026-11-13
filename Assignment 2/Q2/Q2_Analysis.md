# Q2 – Performance Analysis

## 1. Objective

To compare ArrayList, LinkedList and ArrayDeque based on insertion, removal, indexed access and iteration operations.

## 2. Experimental Results

The following results were obtained from the Java benchmark program.

| Operation | ArrayList (ns) | LinkedList (ns) | ArrayDeque (ns) |
|---|---:|---:|---:|
| Add 10,000 Elements | 812000 | 793200 | 875900 |
| Insert First | 63000 | 5700 | 2100 |
| Access Middle | 2600 | 51200 | Not Supported |
| Remove First | 5600 | 2000 | 1500 |
| Iteration | 900500 | 932800 | 870400 |

## 3. Performance Analysis

- **ArrayList:** Provides fast indexed access. Inserting or removing at the beginning requires shifting elements.
- **LinkedList:** Supports efficient insertion and removal at the beginning. Accessing a middle element requires traversal.
- **ArrayDeque:** Provides efficient insertion and removal at both ends. It does not support indexed access.

The measured results show that ArrayList performed best for middle-element access, while ArrayDeque recorded the lowest times for insertion and removal at the beginning and iteration in this run.

These are individual measurements and may vary across repeated executions and systems.

## 4. Time Complexity

| Operation | ArrayList | LinkedList | ArrayDeque |
|---|---|---|---|
| Access by index | O(1) | O(n) | Not supported |
| Add at end | O(1) amortized | O(1) | O(1) amortized |
| Add at beginning | O(n) | O(1) | O(1) amortized |
| Remove at beginning | O(n) | O(1) | O(1) amortized |
| Iteration | O(n) | O(n) | O(n) |

## 5. Design Decision

For a music playlist application:

- ArrayList is suitable for storing the complete playlist because it provides fast indexed access.
- LinkedList is useful when frequent insertions and removals at the beginning or end are required.
- ArrayDeque is recommended for the Up Next queue because it efficiently supports adding and removing songs at both ends.

## 6. Conclusion

ArrayList, LinkedList and ArrayDeque have different performance characteristics.

The correct collection should be selected based on the operations performed most frequently. For a music playlist, ArrayList is suitable for storing songs, while ArrayDeque is a suitable choice for managing the Up Next queue.