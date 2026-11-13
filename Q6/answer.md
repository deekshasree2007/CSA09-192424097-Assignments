# Q6 – Deadlock and Inter-Thread Communication

## 1. Introduction
Inter-thread communication allows multiple threads to coordinate their activities.

## 2. Producer-Consumer Problem
The producer adds items to a shared buffer, while the consumer removes items from it.

## 3. wait() and notifyAll()
- wait() makes a thread release the object's monitor and wait.
- notifyAll() wakes all threads waiting on that object's monitor.
- A while loop checks the buffer condition again after waking.

## 4. Deadlock
Deadlock occurs when two or more threads wait indefinitely for resources held by each other.

## 5. Coffman Conditions
1. Mutual exclusion
2. Hold and wait
3. No preemption
4. Circular wait

All four conditions must hold for deadlock to occur.

## 6. Deadlock Prevention
- Use consistent lock ordering.
- Avoid unnecessary nested locks.
- Use ReentrantLock.tryLock() with suitable timeouts.
- Use ArrayBlockingQueue for a ready-made bounded buffer.

## 7. Conclusion
The producer-consumer program demonstrates thread coordination using synchronization, wait() and notifyAll().