# Q6 – Analysis and Observations

## 1. Aim

To implement a patient triage system using Java PriorityQueue and a custom Comparator.

## 2. Observations

- PriorityQueue processes patients according to severity.
- Patients with lower severity numbers are treated first.
- Patients with equal severity are processed according to arrival order.
- The poll() method retrieves and removes the highest-priority patient.
- The queue becomes empty after all patients are processed.

## 3. Complexity Analysis

| Operation | Time Complexity |
|---|---|
| Insert (offer) | O(log n) |
| Remove (poll) | O(log n) |
| View head (peek) | O(1) |
| Check if empty | O(1) |

## 4. Design Decision

PriorityQueue is suitable for the hospital triage system because patients must be treated according to medical urgency rather than only their arrival time.

Using arrival order as a tie-breaker ensures fair processing among patients with equal severity.

## 5. Conclusion

The experiment demonstrates how PriorityQueue and Comparator can implement priority-based scheduling in real-world applications.