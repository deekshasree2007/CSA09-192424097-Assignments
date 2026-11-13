# Q3 – Experiment Procedure

## 1. Aim

To understand how HashSet uses hashCode() and equals() to identify duplicate Student objects.

## 2. Software Requirements

- Java
- Visual Studio Code
- Java Compiler (javac)

## 3. Procedure

1. Created the Attendance.java file.
2. Created a HashSet to store student names.
3. Inserted duplicate and unique names.
4. Executed the program and observed that duplicate names were removed.
5. Created a Student class with register number and name.
6. Overrode the equals() method to compare register numbers.
7. Overrode the hashCode() method using the register number.
8. Inserted three Student objects into the HashSet.
9. Executed the program and verified the number of unique students.

## 4. Observations

The first program stored three unique names even though four entries were inserted.

The second program stored only two unique Student objects because two objects had the same register number.

## 5. Result

The experiment successfully demonstrated duplicate detection in HashSet using hashCode() and equals().

## 6. Conclusion

Both methods must be implemented consistently to ensure correct duplicate detection for user-defined objects.