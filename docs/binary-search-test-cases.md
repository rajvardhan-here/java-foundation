# Binary Search Test Cases

The examples below can be checked using `BinarySearch.binarySearch(array, target)`.

| Case | Input array | Target | Expected result |
|---|---|---:|---:|
| Middle element exists | `[1, 3, 5, 7, 9]` | 5 | 2 |
| First element exists | `[1, 3, 5, 7, 9]` | 1 | 0 |
| Last element exists | `[1, 3, 5, 7, 9]` | 9 | 4 |
| Target is missing | `[1, 3, 5, 7, 9]` | 4 | -1 |
| Empty array | `[]` | 4 | -1 |
| Single-element match | `[8]` | 8 | 0 |
| Single-element miss | `[8]` | 3 | -1 |

Remember: the array must be sorted before binary search is used.
