# Q7 – Concurrent, Fault-Tolerant Processor from First Principles

## 1. Introduction
Concurrent processing allows multiple files to be processed simultaneously using multiple threads.

## 2. ExecutorService
ExecutorService manages a pool of worker threads and executes submitted tasks.

## 3. Callable and Future
- Callable represents a task that returns a result.
- Future stores the result of an asynchronous task.
- get() retrieves the completed result.

## 4. Fault Tolerance
The program handles invalid files individually without stopping the entire processing operation.

## 5. Thread Pool Sizes
The program tests four thread pool sizes:
- 1 thread
- 2 threads
- 4 threads
- 8 threads

## 6. Performance Measurement
System.nanoTime() measures the execution time for each thread pool configuration.

## 7. Complexity
For N files, each file is processed once. The total processing work is O(N), excluding file-reading and parsing costs.

## 8. Conclusion
The program demonstrates concurrent file processing, fault tolerance, task scheduling and performance measurement using Java concurrency utilities.