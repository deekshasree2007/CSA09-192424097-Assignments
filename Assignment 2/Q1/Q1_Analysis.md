# Q1 – Performance Analysis

## 1. Objective

The objective of this experiment is to compare the performance of String, StringBuilder and StringBuffer while creating ticket information repeatedly.

## 2. Experimental Results

The program was executed five times to obtain more reliable performance measurements.

| Method | Run 1 (ns) | Run 2 (ns) | Run 3 (ns) | Run 4 (ns) | Run 5 (ns) | Average (ns) |
|---|---:|---:|---:|---:|---:|---:|
| String | 97344400 | 97082600 | 104476300 | 103507600 | 90075800 | 98497340 |
| StringBuilder | 1896100 | 1863500 | 1814700 | 1790700 | 1826800 | 1838360 |
| StringBuffer | 1101300 | 1181900 | 1182100 | 1138700 | 1091300 | 1139060 |

## 3. Analysis

- **String:** It took the longest average time because String objects are immutable. Every concatenation creates a new String object.
- **StringBuilder:** It performed much faster because it modifies the same mutable object using append().
- **StringBuffer:** It had the lowest average time in these five runs. It is mutable and provides synchronized methods for thread safety.

The results show that String concatenation is much slower for repeated modifications in this experiment. The measured result for StringBuffer was faster than StringBuilder on this particular laptop and workload. This does not mean StringBuffer is always faster.

## 4. Complexity

- Repeated String concatenation can take approximately O(n²) time for this pattern.
- StringBuilder takes approximately O(n) total time for repeated appends.
- StringBuffer also takes approximately O(n) total time, with synchronization overhead.

## 5. Design Decision

StringBuilder is generally recommended for building ticket information in a single-threaded application because it is mutable and avoids creating a new String object for every append operation.

StringBuffer can be useful when synchronized access to a shared mutable string is required. However, synchronization of individual methods does not automatically make a sequence of multiple operations atomic.

## 6. Conclusion

The experiment demonstrates that choosing the appropriate string class can improve program performance. Based on the general design requirements, StringBuilder is a suitable choice for single-threaded ticket information generation. Actual benchmark timings should be interpreted in the context of the particular workload and environment.