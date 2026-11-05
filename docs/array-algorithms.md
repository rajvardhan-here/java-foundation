# Array Algorithms: Prefix Sum and Kadane

## Prefix sums

A prefix-sum array stores cumulative totals:

`prefix[i] = values[0] + values[1] + ... + values[i]`

After an **O(n)** preprocessing pass, an inclusive range sum can be answered in **O(1)**:

- If the range starts at zero, use `prefix[right]`.
- Otherwise, use `prefix[right] - prefix[left - 1]`.

This is useful when many range-sum queries are made against an array that does not change.

## Kadane's algorithm

Kadane's algorithm finds the maximum sum of a non-empty contiguous subarray in **O(n)** time and **O(1)** extra space.

At each position, choose between starting a new subarray at the current value and extending the previous subarray. Track the best sum seen so far. Initialising both running values from the first element correctly handles arrays containing only negative numbers.

## Run the examples

From the repository root:

```bash
javac src/07_arrays/ArrayAlgorithms.java src/07_arrays/ArrayAlgorithmsTest.java
java -ea -cp src/07_arrays ArrayAlgorithmsTest
```

Assertions are enabled with `-ea`; without it, Java skips the test assertions.
