# Q7 – Experiment and Testing

## Test 1: Valid Score Files
Input: 85, 92, 76

Expected Result: All three scores are processed successfully.

## Test 2: Invalid Text
Input: invalid

Expected Result: File processing failure is reported.

## Test 3: Out-of-Range Score
Input: 105

Expected Result: Score validation error is reported.

## Test 4: Average Calculation
Expected Result:
Average = (85 + 92 + 76) / 3 = 84.33

## Test 5: Thread Pool Comparison
Pool sizes tested: 1, 2, 4 and 8.

Expected Result: Execution time is displayed for each configuration.

## Final Observation
The application processes valid files, handles invalid files and completes the processing using different thread pool configurations.