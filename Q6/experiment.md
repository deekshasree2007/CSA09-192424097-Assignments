# Q6 – Experiment and Testing

## Test 1: Producer Operation
Expected Result: Five items are inserted into the buffer.

## Test 2: Consumer Operation
Expected Result: Five items are removed from the buffer.

## Test 3: Full Buffer
Expected Result: Producer waits when the buffer reaches capacity.

## Test 4: Empty Buffer
Expected Result: Consumer waits when the buffer is empty.

## Test 5: Thread Completion
Expected Result: Both threads finish and the completion message appears.

## Final Observation
The producer-consumer problem was implemented successfully using wait() and notifyAll().