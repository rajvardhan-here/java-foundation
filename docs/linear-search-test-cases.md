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
