# Q6 – Queue and PriorityQueue

## 1. Introduction

Queue is a linear data structure that follows the FIFO (First In, First Out) principle.

PriorityQueue is a Java collection that processes elements according to their priority instead of simple insertion order.

## 2. Queue

- Follows FIFO.
- Elements are inserted at the rear.
- Elements are removed from the front.
- Common methods include offer(), poll() and peek().

## 3. PriorityQueue

- Processes elements based on priority.
- Uses a heap internally.
- The head contains the highest-priority element according to its comparator.
- Insertion and removal take O(log n) time.
- Accessing the head takes O(1) time.

## 4. Triage System

In this program, patients are assigned severity levels.

A lower severity number indicates a more urgent patient.

The Comparator uses:
1. Severity in ascending order.
2. Arrival order in ascending order when severity is equal.

## 5. Program Output

PATIENT TREATMENT ORDER

Meena(S1)

Kumar(S1)

Lata(S2)

Ravi(S3)

John(S3)

Asha(S5)

## 6. Importance of Arrival Order

When two patients have the same severity, the patient who arrived first is treated first.

This prevents unnecessary ordering changes between patients with equal severity.

## 7. Conclusion

PriorityQueue is useful in applications where tasks must be processed according to priority. A Comparator can define custom priority rules and preserve arrival order when priorities are equal.