# Two Pointers

Two pointers track positions in a collection to avoid repeatedly scanning every pair.

## Common patterns
- **Opposite ends:** start at both ends of a sorted array and move based on the current result.
- **Read/write:** scan once while writing only values that should remain.
- **Fast/slow:** useful for linked-list cycles and in-place compaction.

## Examples
- [Pair sum](../src/08_two_pointers/PairSumSorted.java)
- [Reverse array](../src/08_two_pointers/ReverseInPlace.java)
- [Move zeroes](../src/08_two_pointers/MoveZeroes.java)
- [Remove duplicates](../src/08_two_pointers/RemoveDuplicatesSorted.java)
- [Container with most water](../src/08_two_pointers/ContainerWithMostWater.java)
- [Three Sum](../src/08_two_pointers/ThreeSum.java)

Most examples run in O(n) time and O(1) auxiliary space. Three Sum sorts a copy and takes O(n²) after sorting. Pair sum and duplicate removal require sorted input; Three Sum preserves the caller's array by sorting a clone.
