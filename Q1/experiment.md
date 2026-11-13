# Q1 – Experiment and Testing

## Test Case 1: Successful Withdrawal
Input:
- Account Number: 12345
- Withdrawal Amount: 500

Expected Result: Withdrawal successful.

## Test Case 2: Insufficient Balance
Input:
- Account Number: 12345
- Withdrawal Amount: 7000

Expected Result: Transaction declined due to insufficient balance.

## Test Case 3: Negative Amount
Input:
- Account Number: 12345
- Withdrawal Amount: -100

Expected Result: Invalid amount message displayed.

## Test Case 4: Invalid Numeric Input
Input:
- Account Number: abc

Expected Result: Please enter numbers only.

## Test Case 5: Missing Card File
Input:
- Rename card.txt to card_backup.txt.

Expected Result: Card reader file not found.

## Final Observation
All five test scenarios were used to verify the ATM program's exception-handling behavior.