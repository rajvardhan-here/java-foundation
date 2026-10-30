# Linear Search Test Cases

| Case | Input array | Target | Expected index |
|---|---|---:|---:|
| First element | [4, 7, 9] | 4 | 0 |
| Middle element | [4, 7, 9] | 7 | 1 |
| Last element | [4, 7, 9] | 9 | 2 |
| Missing target | [4, 7, 9] | 5 | -1 |
| Empty array | [] | 5 | -1 |
| Duplicate values | [2, 5, 5, 8] | 5 | 1 |

For a null array, the implementation throws IllegalArgumentException.

| Single element match | [6] | 6 | 0 |
| Single element miss | [6] | 2 | -1 |
| Negative values | [-8, -3, 0, 4] | -3 | 1 |

## Additional variant checks

| Method | Input | Expected |
|---|---|---|
| findLast | [2, 5, 5, 8], target 5 | 2 |
| countOccurrences | [2, 5, 5, 8], target 5 | 2 |
| findAllIndices | [2, 5, 5, 8], target 5 | [1, 2] |

| findInRange | [10, 20, 30, 20], target 20, range [2, 4) | 3 |
| contains | [1, 3, 5], target 3 | true |
| contains | [1, 3, 5], target 8 | false |
