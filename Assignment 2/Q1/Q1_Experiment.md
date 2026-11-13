# Q1 – Experiment Procedure and Observations

## 1. Aim

To compare the execution performance of String, StringBuilder and StringBuffer while repeatedly generating ticket information.

## 2. Software Requirements

- Programming Language: Java
- IDE: Visual Studio Code
- Compiler: javac
- Execution Environment: Java Runtime Environment

## 3. Experimental Procedure

1. Created a Java program named TicketBenchmark.java.
2. Used String concatenation to generate ticket information.
3. Used StringBuilder append() to generate the same information.
4. Used StringBuffer append() to generate the same information.
5. Measured execution time using System.nanoTime().
6. Executed the program five times.
7. Recorded the execution time of all three methods.
8. Calculated the average execution time for comparison.

## 4. Observations

- String concatenation required the highest average execution time.
- StringBuilder performed considerably faster than String.
- StringBuffer recorded the lowest average time in the five observed runs.
- Performance measurements can vary depending on the system and execution environment.

## 5. Result

The experiment successfully compared String, StringBuilder and StringBuffer.

Based on the general characteristics of these classes, StringBuilder is a suitable choice for repeated string modifications in a single-threaded application. The measured results are specific to this experiment.

## 6. Files Submitted

- Q1_Answer.md
- TicketBenchmark.java
- Q1_Output.png
- Q1_Results.csv
- Q1_Analysis.md
- Q1_Experiment.md