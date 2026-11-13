# Q3 – Analysis and Observations

## 1. Purpose

The purpose of this experiment is to understand how HashSet identifies duplicate user-defined objects using hashCode() and equals().

## 2. Observations

- HashSet stores only unique elements.
- The equals() method compares student register numbers.
- The hashCode() method generates a hash value using the register number.
- Two Student objects with the same register number are treated as duplicates.
- The insertion order is not guaranteed.

## 3. Importance of Overriding Both Methods

If equals() is overridden without correctly overriding hashCode(), HashSet may fail to identify logically equal objects because they may be placed in different hash buckets.

Therefore, both methods must follow the hashCode–equals contract.

## 4. Result

The program inserted three Student objects but stored only two unique students.

## 5. Conclusion

HashSet is useful when duplicate entries must be avoided. Correctly implementing equals() and hashCode() ensures reliable object comparison and duplicate detection.