# Q5 – Experiment and Testing

## Test 1: Two Customers
Input:
- Customer A
- Customer B

Expected Result:
Only one customer books the seat successfully.

## Test 2: Concurrent Booking
Expected Result:
Both threads attempt booking, but synchronization allows only one successful booking.

## Test 3: Final Booking Status
Expected Result:
The seat remains booked after the first successful booking.

## Final Observation
The program successfully prevents duplicate seat booking using synchronization.