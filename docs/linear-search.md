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

## Why use linear search?

It works on sorted and unsorted arrays. Unlike binary search, it does not require sorting or random-access ordering assumptions beyond normal array indexing.

## Variants in the Java implementation

- `findFirst`: first matching index.
- `findLast`: last matching index, scanning from right to left.
- `countOccurrences`: total number of matches.
- `findAllIndices`: all matching positions.
- `findInRange`: search a half-open range `[startInclusive, endExclusive)`.

