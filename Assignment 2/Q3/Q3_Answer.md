# Q3 – HashSet and hashCode–equals Contract

## 1. Introduction

HashSet is a collection in Java that stores unique elements. It does not allow duplicate values and does not guarantee insertion order.

## 2. Role of equals()

The equals() method compares two objects to determine whether they are logically equal.

In this program, two Student objects are considered equal if they have the same register number.

## 3. Role of hashCode()

The hashCode() method generates an integer hash value for an object. HashSet uses this value to identify the bucket in which an object should be stored.

## 4. hashCode() and equals() Contract

- If two objects are equal according to equals(), they must have the same hash code.
- Objects with different hash codes cannot be equal.
- Objects with the same hash code are not necessarily equal.
- Both methods should be overridden consistently when objects are stored in HashSet or used as HashMap keys.

## 5. Program Result

The program inserts three Student objects:

- Student 101 – Ravi
- Student 102 – Meena
- Student 101 – Ravi Kumar

Since the first and third objects have the same register number, they are treated as duplicates.

**Expected output:**

Total Unique Students: 2

## 6. Conclusion

The experiment demonstrates how HashSet uses hashCode() and equals() to avoid duplicate objects. Overriding both methods correctly ensures that objects are compared based on their logical identity.