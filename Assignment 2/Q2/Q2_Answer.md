# Q2 – Choosing the Right Collection

## 1. Introduction

Java Collection Framework provides different data structures to store and manage groups of objects.

In this question, ArrayList, LinkedList and ArrayDeque are compared based on their performance and operations.

## 2. ArrayList

- ArrayList uses a dynamic array internally.
- It allows duplicate elements.
- It maintains insertion order.
- It provides fast access using an index.
- Inserting or deleting elements in the middle requires shifting elements.

## 3. LinkedList

- LinkedList uses a doubly linked list.
- It allows duplicate elements.
- It maintains insertion order.
- Insertion and deletion at the beginning or end are efficient.
- Accessing an element using an index is slower because traversal is required.

## 4. ArrayDeque

- ArrayDeque uses a resizable array.
- It implements both Queue and Deque interfaces.
- It supports insertion and deletion at both ends.
- It is suitable for implementing queues and stacks.
- It does not support direct index-based access.
- It does not allow null elements.

## 5. Comparison Table

| Feature | ArrayList | LinkedList | ArrayDeque |
|---|---|---|---|
| Internal structure | Dynamic array | Doubly linked list | Resizable array |
| Random access | Fast | Slow | Not supported |
| Insertion at beginning | Slow | Fast | Fast |
| Insertion at end | Fast (amortized) | Fast | Fast (amortized) |
| Memory usage | Lower overhead | Higher overhead | Lower overhead |
| Duplicate elements | Allowed | Allowed | Allowed |
| Null elements | Allowed | Allowed | Not allowed |

## 6. Time Complexity

| Operation | ArrayList | LinkedList | ArrayDeque |
|---|---|---|---|
| Access by index | O(1) | O(n) | Not supported |
| Add at end | O(1) amortized | O(1) | O(1) amortized |
| Add at beginning | O(n) | O(1) | O(1) amortized |
| Remove at beginning | O(n) | O(1) | O(1) amortized |
| Iteration | O(n) | O(n) | O(n) |

## 7. Design Decision

For a music playlist application:

- ArrayList is suitable for storing the complete playlist because it supports fast index-based access.
- LinkedList can be used when frequent insertions and deletions at the ends are required.
- ArrayDeque is suitable for managing the Up Next queue because it efficiently supports adding and removing songs from both ends.

## 8. Conclusion

ArrayList, LinkedList and ArrayDeque have different advantages.

The appropriate collection should be selected based on the operations performed most frequently. For a music playlist, ArrayList is suitable for storing songs, while ArrayDeque is a good choice for managing the Up Next queue.