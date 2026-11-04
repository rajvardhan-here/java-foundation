# Arrays Part 2: Subarrays and Prefix Sums

A **subarray** is a contiguous section of an array. This module explores ways to calculate subarray sums and answer range queries.

## Maximum subarray sum

### Brute force

`bruteforce.maxSubArray(int[])` checks every possible start and end position, then sums the selected range.

- Time: `O(n^3)`
- Extra space: `O(1)`
- Useful for learning the problem and validating small test cases.

### Prefix sums

The prefix array has length `n + 1`. `prefix[i]` stores the sum of the first `i` values, and `prefix[0]` is zero.

For an inclusive range `[left, right]`:

```java
int sum = prefix[right + 1] - prefix[left];
```

- Build: `O(n)` time and `O(n)` space.
- Each range query: `O(1)` time.

### Kadane's algorithm

At each position, either start a new subarray or extend the previous one:

```java
currentSum = Math.max(numbers[i], currentSum + numbers[i]);
maxSum = Math.max(maxSum, currentSum);
```

- Time: `O(n)`
- Extra space: `O(1)`
- Initializing from the first element correctly handles all-negative arrays.

## Run the examples

From the repository root:

```bash
javac src/07_arrays_part2/*.java
java -cp src/07_arrays_part2 SubarrayExamples
```

Expected output:

```text
Brute-force maximum: 7
Kadane maximum: 7
All-negative maximum: -2
Range sum [1, 3]: 7
```

> The examples use `int`. Use `long` if input values or cumulative sums may exceed the integer range.
