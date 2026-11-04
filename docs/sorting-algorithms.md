# Sorting Algorithms

| Algorithm | Best | Average | Worst | Stable |
|---|---:|---:|---:|---|
| Bubble sort (early exit) | O(n) | O(n²) | O(n²) | Yes |
| Selection sort | O(n²) | O(n²) | O(n²) | No |
| Insertion sort | O(n) | O(n²) | O(n²) | Yes |
| Merge sort | O(n log n) | O(n log n) | O(n log n) | Yes |
| Quick sort (last pivot) | O(n log n) | O(n log n) | O(n²) | No |

## Choosing an algorithm
- Insertion sort is useful for small or nearly sorted inputs.
- Merge sort offers predictable O(n log n) time but needs an auxiliary array.
- Quick sort is often fast in practice, but a last-element pivot can degrade on sorted input.
- Bubble and selection sort are useful for learning elementary sorting mechanics.

Each source file is standalone and includes a small main demonstration.
