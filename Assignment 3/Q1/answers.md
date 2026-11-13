# Q1 – Handling Failure in a Bank ATM Simulation

## 1. Exception Handling

Exception handling is a mechanism in Java used to handle runtime errors and maintain normal program execution.

Java uses try, catch, finally, throw and throws keywords.

## 2. Types of Exceptions

- Checked Exceptions: Checked during compilation.
- Unchecked Exceptions: Occur during runtime.
- Errors: Serious problems that applications generally cannot handle.

## 3. Custom Exception

InsufficientFundsException is a user-defined checked exception created by extending the Exception class.

## 4. Catch Block Ordering

Specific exceptions must be caught before general exceptions.

## 5. Finally Block

The finally block executes whether an exception occurs or not. It is used for cleanup operations.

## 6. Test Cases

1. Successful withdrawal – Transaction completed.
2. Insufficient balance – Transaction declined.
3. Negative amount – Invalid amount message displayed.
4. Invalid input – Numbers-only message displayed.
5. Missing card file – File not found message displayed.

## 7. Conclusion

The ATM simulation demonstrates Java exception handling using built-in exceptions, custom exceptions, multiple catch blocks and finally. It helps prevent unexpected program termination and improves reliability.