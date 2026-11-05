# Sorting Algorithms

This note compares the sorting implementations in `src/10_sorting`.

## Quick sort

Quick sort partitions the array around a pivot. Values smaller than or equal to the pivot move to its left; the same process is then applied recursively to both partitions.

- Average time: **O(n log n)**
- Worst-case time: **O(n²)** when partitions are consistently unbalanced
- Auxiliary space: **O(log n)** on average for recursion; up to **O(n)** in the worst case
- Stable: No

The current implementation chooses the last element as pivot. This keeps the partition logic approachable, but sorted input can produce poor partitions.

## Merge sort

Merge sort divides the array into halves, sorts each half, and merges them using a temporary array.

- Best, average, and worst-case time: **O(n log n)**
- Auxiliary space: **O(n)**
- Stable: Yes; equal values are taken from the left half first

## Choosing an algorithm

| Situation | Suitable choice |
|---|---|
| Learning partitioning and recursion | Quick sort |
| Predictable O(n log n) running time | Merge sort |
| Stability is required | Merge sort |
| Auxiliary memory is limited | Quick sort is often preferable |

## Practice checklist

1. Trace one quick-sort partition by hand.
2. Explain why merge sort uses a temporary array.
3. Compare both algorithms on sorted, reverse-sorted, and duplicate-heavy input.
4. State time and auxiliary-space complexity before coding.
