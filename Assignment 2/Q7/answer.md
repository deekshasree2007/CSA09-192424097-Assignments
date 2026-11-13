# Q7 – Diagnose, Redesign and Validate

## A. Diagnose the Bottleneck (2 Marks)

The original ticket-generation program uses String concatenation with the + operator inside a loop.

String objects are immutable. Therefore, each concatenation creates a new String instead of modifying the existing one.

For a large number of fields, this causes repeated copying of characters and unnecessary intermediate object creation.

The original program took an average of 511,973,580 nanoseconds in the experiment.

This indicates that repeated String concatenation is a significant performance limitation for large ticket generation workloads.

## B. Define the Design Objective (2 Marks)

The objective is to:

1. Reduce repeated String object creation.
2. Avoid unnecessary copying of previously generated text.
3. Reduce ticket-generation execution time.
4. Produce exactly the same ticket output as the original program.

The measurable objective is to reduce average execution time for generating a ticket containing 10,000 fields.

## C. Design the Revised Solution (4 Marks)

### Original Design

- Uses String.
- Concatenates text using the + operator inside a loop.
- Creates new String objects during repeated concatenation.
- Causes repeated copying of characters.

### Redesigned Solution

- Uses StringBuilder.
- Uses append() to add text to the existing mutable character buffer.
- Pre-allocates an estimated capacity to reduce buffer resizing.
- Converts the final result into a String using toString().

### Pseudocode

1. Create a StringBuilder with estimated capacity.
2. Repeat for each field.
3. Append the field text.
4. Convert the builder into a String.
5. Return the generated ticket.

### Complexity Analysis

| Operation | Original String | StringBuilder |
|---|---|---|
| Building n fields | O(n²) character copying in the general repeated-concatenation model | O(n) amortized |
| Extra working space | Multiple intermediate String objects | One expandable buffer |
| Modification | Creates new objects | Modifies existing buffer |

The redesigned approach reduces unnecessary object creation and repeated copying.

## D. Predict Before Implementing (1 Mark)

Before implementation, I predicted that StringBuilder would perform better than repeated String concatenation for a large number of fields.

I expected lower execution time and fewer intermediate objects while maintaining identical output.

## E. Implement and Validate the Redesign (2 Marks)

Both implementations were tested using 10,000 fields and five measured repetitions after a warm-up.

### Experimental Results

| Run | Original (ns) | Redesigned (ns) |
|---|---:|---:|
| 1 | 583513400 | 10742000 |
| 2 | 700210800 | 7593200 |
| 3 | 350385400 | 463500 |
| 4 | 463945800 | 6933200 |
| 5 | 461812500 | 4889100 |
| Average | 511973580 | 6124200 |

### Performance Improvement

Original average = 511,973,580 ns

Redesigned average = 6,124,200 ns

Percentage reduction in execution time:

((Original Average - Redesigned Average) / Original Average) × 100

= 98.80% approximately.

The redesigned solution was approximately 83.6 times faster in this experiment.

Both implementations produced identical output.

## F. Defend the Final Design (2 Marks)

The experimental results support the prediction.

The StringBuilder implementation reduced the average execution time from approximately 511.97 milliseconds to 6.12 milliseconds.

This represents an approximately 98.80% reduction in execution time.

### Advantages

- Reduces repeated String object creation.
- Avoids repeated copying of previously generated ticket text.
- Improves performance for large text-building workloads.
- Maintains the correctness of the generated output.

### Trade-offs

- StringBuilder is mutable, so it requires care when shared between threads.
- Pre-sizing requires estimating the required capacity.
- The final toString() operation creates the resulting String.

### When the Original Solution May Be Suitable

For very small strings or a small number of concatenations, ordinary String concatenation may be simpler and sufficiently fast.

### Final Conclusion

The redesign successfully addressed the performance limitation of repeated String concatenation.

StringBuilder is a better choice for generating large e-tickets because it reduces unnecessary object creation and improves execution time.

For a shared multithreaded log, synchronization or another thread-safe design is required. StringBuffer can be considered when synchronized individual operations are needed, but it does not automatically make a multi-operation sequence atomic.