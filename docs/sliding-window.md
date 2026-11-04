# Sliding Window

Sliding window maintains a contiguous range and updates it as the range moves. It often turns repeated range calculations into a linear scan.

## Fixed-size window
Calculate the first window once. For each next position, add the incoming value and subtract the outgoing value. See [MaximumWindowSum](../src/09_sliding_window/MaximumWindowSum.java) and [MaximumAverageSubarray](../src/09_sliding_window/MaximumAverageSubarray.java).

## Variable-size window
Expand the right edge, then move the left edge while the condition is met. See [MinimumSizeSubarraySum](../src/09_sliding_window/MinimumSizeSubarraySum.java). This implementation requires positive values so shrinking reliably decreases the sum.

## Strings
A window plus a last-seen index map finds the longest substring without repeating characters: [LongestUniqueSubstring](../src/09_sliding_window/LongestUniqueSubstring.java).

Each pointer moves forward at most n times, so these approaches generally run in O(n). Auxiliary space depends on the state stored by the window.
