# Q5 – Generics, Comparable and Comparator

## 1. Introduction

Generics allow classes, interfaces and methods to work with different data types while providing compile-time type safety.

## 2. Generics

In this program, Leaderboard<T> is a generic class.

The type parameter T allows the leaderboard to store different types of objects without writing separate classes for each type.

## 3. Comparable

Comparable is an interface used to define the natural ordering of objects.

It uses the compareTo() method to compare objects.

Example:
- Sorting students by register number.
- Sorting employees by employee ID.

## 4. Comparator

Comparator is an interface used to define custom ordering.

It uses the compare() method and allows multiple sorting rules.

In this program, Comparator sorts teams based on:
1. Points in descending order.
2. Goal difference in descending order.
3. Team name in alphabetical order.

## 5. Difference Between Comparable and Comparator

| Comparable | Comparator |
|---|---|
| Uses compareTo() | Uses compare() |
| Defines natural ordering | Defines custom ordering |
| Implemented inside the class | Can be defined separately |
| Usually one natural order | Multiple custom orders possible |

## 6. Program Output

TEAM LEADERBOARD

Eagles (9 points, Goal Difference: 6)

Bisons (9 points, Goal Difference: 4)

Panthers (9 points, Goal Difference: 4)

Cobras (6 points, Goal Difference: 1)

## 7. Conclusion

Generics provide type safety and code reusability. Comparable and Comparator support object sorting. Comparator is useful when an application needs multiple custom ranking rules.