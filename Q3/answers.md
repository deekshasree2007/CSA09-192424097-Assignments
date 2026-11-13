# Q3 – Resource Safety, Debugging and Robust Code

## 1. Introduction
Resource management ensures that resources such as files, streams and database connections are properly closed.

## 2. Manual Resource Management
Resources can be closed manually using the finally block. However, this requires extra code and may cause resource leaks.

## 3. Try-with-Resources
Try-with-resources automatically closes resources after execution. It works with classes implementing AutoCloseable.

## 4. Suppressed Exceptions
If an exception occurs while closing a resource after another exception, the closing exception becomes a suppressed exception.

## 5. Debugging
Breakpoints help pause program execution and inspect variables, identify errors and understand program flow.

## 6. Conclusion
Try-with-resources improves resource safety, reduces code complexity and prevents resource leaks.