# Q5 – Race Conditions in Cinema Seat Booking

## 1. Introduction
A race condition occurs when multiple threads access shared data simultaneously and the final result depends on execution order.

## 2. Synchronization
Synchronization controls access to shared resources and prevents multiple threads from executing a critical section simultaneously.

## 3. Synchronized Method
The synchronized keyword allows only one thread at a time to execute the booking method on the same CinemaHall object.

## 4. Critical Section
The critical section checks whether the seat is available and updates its booking status.

## 5. Alternative Solutions
- Atomic variables
- ReentrantLock
- ConcurrentHashMap

These mechanisms help manage concurrent access to shared data.

## 6. Conclusion
Synchronization prevents two customers from booking the same cinema seat simultaneously.