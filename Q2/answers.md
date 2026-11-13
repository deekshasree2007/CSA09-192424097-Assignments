# Q2 – User-Defined Exceptions and Propagation in Online Examination Portal

## 1. Introduction

Exception handling in Java helps manage errors during program execution. User-defined exceptions allow developers to represent application-specific problems.

## 2. Custom Exceptions

The program uses three custom checked exceptions:

- ExamClosedException – thrown when the examination is closed.
- StudentNotRegisteredException – thrown when a student is not registered.
- StorageException – thrown when answer storage fails.

These exceptions extend the Exception class.

## 3. Exception Propagation

Exception propagation transfers an exception from one method to its caller.

The program contains three layers:

1. Controller Layer – handles exceptions and displays messages.
2. Service Layer – checks examination status and student registration.
3. Storage Layer – saves answers and handles storage failures.

## 4. Exception Chaining

Exception chaining connects one exception to another using the cause of the original exception.

The StorageException constructor uses super(message, cause) to preserve the original IOException.

## 5. Test Scenarios

| Scenario | Result |
|---|---|
| Exam closed | ExamClosedException |
| Student not registered | StudentNotRegisteredException |
| Storage failure | StorageException |
| Successful submission | Answer saved successfully |

## 6. Checked vs Unchecked Exceptions

Checked exceptions are verified by the compiler and must be handled or declared.

Unchecked exceptions occur at runtime and do not require mandatory handling.

## 7. Conclusion

The online examination portal demonstrates custom checked exceptions, exception propagation, exception chaining and layered exception handling. It improves error reporting and application reliability.