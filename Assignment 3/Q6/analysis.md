# Q6 – Analysis

## Objective
To understand deadlock and inter-thread communication in Java.

## Implementation
A shared buffer with capacity three is used by producer and consumer threads.

## Observations
- Producer adds five items.
- Consumer removes five items.
- Producer waits when the buffer is full.
- Consumer waits when the buffer is empty.
- notifyAll() wakes waiting threads.
- The program completes after both threads finish.

## Complexity
Each insertion and removal operation takes O(1) time on average using the queue.

## Conclusion
Inter-thread communication helps coordinate concurrent tasks and prevents incorrect access to shared resources.