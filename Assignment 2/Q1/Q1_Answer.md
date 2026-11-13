# Q1 – Building Text Under Load: String, StringBuilder or StringBuffer?

## 1. Introduction

In a railway e-ticket booking system, ticket details such as passenger name, train number, journey date and seat number must be combined into a single text message.

Java provides three ways to build strings:

1. String
2. StringBuilder
3. StringBuffer

These three approaches are compared based on performance, memory usage and thread safety.

## 2. Explanation of Concepts

### String
- String is immutable, which means its value cannot be changed after creation.
- Repeated concatenation using the `+` operator creates new String objects.
- It is simple to use but may be inefficient for repeated modifications.

### StringBuilder
- StringBuilder is mutable.
- Its `append()` method adds content to the existing object.
- It provides efficient string construction.
- It is not synchronized and is suitable for single-threaded operations.

### StringBuffer
- StringBuffer is mutable.
- It provides methods such as `append()`.
- Its methods are synchronized, making individual operations thread-safe.
- Synchronization may introduce additional overhead.

## 3. Comparison

| Feature | String | StringBuilder | StringBuffer |
|---|---|---|---|
| Mutability | Immutable | Mutable | Mutable |
| Thread safety | Safe due to immutability | No | Yes, individual methods |
| Performance for repeated appending | Usually slower | Usually faster | May be slower than StringBuilder |
| Synchronization | Not applicable | No | Yes |

## 4. Time Complexity

- Repeated String concatenation can require repeated copying of the growing text. For similarly sized fields, the total copying can approach O(n²).
- StringBuilder provides amortized O(1) append operations, making the overall construction approximately O(n).
- StringBuffer has similar asymptotic append complexity, but synchronization adds overhead.

## 5. Design Decision

For generating an individual railway ticket, StringBuilder is recommended because it is efficient and does not require synchronization when used by one thread.

For shared multithreaded logging, a properly synchronized logging mechanism or a single-writer queue-based design is preferable. StringBuffer synchronizes individual methods, but it does not automatically make a sequence of multiple operations atomic.

## 6. Conclusion

String is suitable for fixed text, StringBuilder is suitable for efficient text construction in a single thread, and StringBuffer is useful when synchronized access to a mutable string is required. The final selection should depend on the application requirements and measured performance.