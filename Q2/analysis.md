# Q2 – Analysis

## Objective
To implement user-defined exceptions and understand exception propagation in an online examination portal.

## Exceptions Used

| Exception | Purpose |
|---|---|
| ExamClosedException | Handles closed examinations |
| StudentNotRegisteredException | Handles unregistered students |
| StorageException | Handles answer storage failures |
| IOException | Represents storage-related input/output failure |

## Exception Propagation

The exception travels through the application layers:

- Storage Layer: Handles answer storage.
- Service Layer: Validates exam and student details.
- Controller Layer: Catches exceptions and displays messages.

## Exception Chaining

The StorageException preserves the original IOException using getCause().

## Observations

- Closed examinations were rejected.
- Unregistered students were rejected.
- Storage failures were reported with their original cause.
- Valid submissions were saved successfully.

## Conclusion
Custom exceptions and exception propagation improve error handling, debugging and reliability in Java applications.