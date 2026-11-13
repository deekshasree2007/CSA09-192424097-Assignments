# Q4 – Thread Creation and Thread Life Cycle

## 1. Introduction
Multithreading allows multiple tasks to execute concurrently within a Java program.

## 2. Thread Creation
Java supports two common methods:
- Extending the Thread class.
- Implementing the Runnable interface.

## 3. Thread Life Cycle
A thread can move through these states:
- NEW
- RUNNABLE
- BLOCKED
- WAITING
- TIMED_WAITING
- TERMINATED

## 4. Thread Methods
- start(): Starts a new thread.
- run(): Contains the task performed by a thread.
- sleep(): Pauses execution temporarily.
- join(): Waits for another thread to finish.
- isAlive(): Checks whether a thread is still running.

## 5. Thread Priority and Daemon
Thread priority indicates the scheduler's preference, but does not guarantee execution order. Daemon threads support background tasks.

## 6. Conclusion
Multithreading improves responsiveness and allows multiple tasks to execute concurrently.