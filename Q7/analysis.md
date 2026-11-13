# Q7 – Analysis

## Objective
To build a concurrent and fault-tolerant file processing system using Java.

## Tools Used
- ExecutorService
- Callable
- Future
- Files API
- System.nanoTime()

## Observations
- Five score files were created.
- Three valid scores were processed successfully.
- Two invalid scores were handled without stopping the application.
- Average score was calculated using valid files.
- Execution time was measured for pool sizes 1, 2, 4 and 8.

## Advantages
- Concurrent execution.
- Better task management.
- Individual failure handling.
- Performance comparison.

## Conclusion
ExecutorService provides an efficient way to manage concurrent tasks and handle multiple file-processing operations.