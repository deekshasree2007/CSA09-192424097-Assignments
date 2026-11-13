# Q2 – Experiment and Testing

## Test Case 1: Exam Closed
Input:
- examOpen = false
- registered = true

Expected Result:
ExamClosedException is displayed.

## Test Case 2: Student Not Registered
Input:
- examOpen = true
- registered = false

Expected Result:
StudentNotRegisteredException is displayed.

## Test Case 3: Storage Failure
Input:
- examOpen = true
- registered = true
- answer = STORAGE_ERROR

Expected Result:
StorageException is displayed along with its original cause.

## Test Case 4: Successful Submission
Input:
- examOpen = true
- registered = true
- answer = Java Answer

Expected Result:
Answer saved successfully.

## Final Observation
All four scenarios were executed successfully to verify custom exceptions, exception propagation and exception chaining.