# Binary Search (Java)

Binary search efficiently finds a target in a **sorted** array by repeatedly checking the middle element and discarding half of the remaining search range.

## How it works

1. Set `left = 0` and `right = array.length - 1`.
2. While `left <= right`, calculate the middle index as `left + (right - left) / 2`.
3. If the middle value equals the target, return its index.
4. If the middle value is smaller, search the right half; otherwise search the left half.
5. Return `-1` if the target is absent.

## Run

From the repository root:

```bash
javac src/07_arrays/BinarySearch.java
java -cp src/07_arrays BinarySearch
```

Expected output:

```text
Target 10 found at index 4
```

**Important:** The input array must be sorted in ascending order.

- Time complexity: `O(log n)`
- Extra space: `O(1)`
