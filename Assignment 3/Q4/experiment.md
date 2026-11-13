# Q4 – Experiment and Testing

## Test 1: Thread Creation
Expected Result: Two ticket booking threads are created.

## Test 2: Concurrent Execution
Expected Result: Station A and Station B messages appear in an interleaved order.

## Test 3: Sleep Method
Expected Result: Each thread pauses briefly between ticket operations.

## Test 4: Join Method
Expected Result: Main thread waits until both threads finish.

## Final Observation
Both threads execute successfully and the main thread prints the completion message at the end.