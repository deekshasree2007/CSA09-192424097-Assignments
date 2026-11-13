# Q2 – Experiment Procedure and Observations

## 1. Aim

To compare the performance of ArrayList, LinkedList and ArrayDeque using different collection operations.

## 2. Software Requirements

- Programming Language: Java
- IDE: Visual Studio Code
- Compiler: javac
- Java Collection Framework

## 3. Experimental Procedure

1. Created PlaylistBenchmark.java.
2. Created ArrayList, LinkedList and ArrayDeque objects.
3. Inserted 10,000 elements into each collection.
4. Measured insertion at the beginning.
5. Measured middle-element access where supported.
6. Measured removal from the beginning.
7. Measured iteration performance.
8. Recorded execution times using System.nanoTime().
9. Compared the results and time complexities.

## 4. Observations

- ArrayList provided fast middle-element access.
- LinkedList supported efficient insertion and removal at the beginning.
- ArrayDeque performed efficiently for operations at both ends.
- ArrayDeque does not provide index-based access.
- Execution times can vary depending on the system and workload.

## 5. Result

The experiment successfully compared three Java collection implementations.

ArrayList is suitable for indexed playlist access, while ArrayDeque is suitable for managing an Up Next queue.

## 6. Files Submitted

- Q2_Answer.md
- PlaylistBenchmark.java
- Q2_Results.csv
- Q2_Output.png
- Q2_Operations_Output.png
- Q2_Analysis.md
- Q2_Experiment.md