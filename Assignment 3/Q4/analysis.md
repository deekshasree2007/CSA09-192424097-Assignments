# Q4 – Analysis

## Objective
To understand thread creation and the thread life cycle in Java.

## Implementation
Two ticket booking threads are created using the Thread class.

## Observations
- Both threads execute concurrently.
- Each thread processes three tickets.
- sleep() pauses execution temporarily.
- join() makes the main thread wait for both threads.
- Both threads complete before the final message.

## Conclusion
Multithreading enables concurrent execution and improves task management in Java applications.