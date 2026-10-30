# Linear Search

Linear Search checks array elements one by one until it finds the target or reaches the end.

## Basic idea

1. Start at index 0.
2. Compare the current element with the target.
3. Return the index immediately when they match.
4. If the loop ends, return -1.

## Complexity

- Best case: O(1), when the first element matches.
- Average case: O(n).
- Worst case: O(n), when the target is last or absent.
- Auxiliary space: O(1).

## Run

From the repository root:

```bash
javac src/07_arrays/LinearSearch.java src/07_arrays/LinearSearchExamples.java
java -cp src/07_arrays LinearSearchExamples
```

The array does not need to be sorted.
