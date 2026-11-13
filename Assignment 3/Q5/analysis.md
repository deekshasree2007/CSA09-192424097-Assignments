# Q5 – Analysis

## Objective
To understand race conditions and synchronization in Java.

## Implementation
Two customer threads attempt to book one shared cinema seat.

## Observations
- Both threads access the same CinemaHall object.
- The synchronized method protects the shared seat status.
- Only one customer successfully books the seat.
- The second customer receives a seat-already-booked message.

## Advantages
- Prevents race conditions.
- Maintains data consistency.
- Protects shared resources.

## Conclusion
Synchronization ensures safe access to shared resources in multithreaded applications.