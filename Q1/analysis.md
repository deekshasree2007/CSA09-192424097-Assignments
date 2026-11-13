# Q1 – Analysis

## Objective
To understand exception handling in Java through an ATM withdrawal simulation.

## Exceptions Used

| Exception | Purpose |
|---|---|
| InputMismatchException | Handles invalid numeric input |
| IllegalArgumentException | Handles negative or zero withdrawal |
| InsufficientFundsException | Handles insufficient account balance |
| FileNotFoundException | Handles missing card reader file |
| IOException | Handles file-related errors |

## Observations

- Valid withdrawal was successful.
- Withdrawal exceeding the balance was rejected.
- Negative withdrawal amounts were rejected.
- Invalid numeric input was handled.
- Missing card-reader file was detected.
- The finally block executed in all tested cases.

## Conclusion
Exception handling makes the ATM application more reliable by handling different runtime problems without unexpected termination.