/**
 * Reusable prefix-sum utilities for integer arrays.
 * Preprocessing: O(n) time and O(n) space; each range query: O(1).
 */
public final class PrefixSum {
    private PrefixSum() { }

    /** prefix[i] stores the sum of values in the half-open range [0, i). */
    public static int[] build(int[] values) {
        if (values == null) throw new IllegalArgumentException("Values must not be null");
        int[] prefix = new int[values.length + 1];
        for (int i = 0; i < values.length; i++) prefix[i + 1] = prefix[i] + values[i];
        return prefix;
    }

    /** Returns the sum in the inclusive range [left, right]. */
    public static int rangeSum(int[] prefix, int left, int right) {
        if (prefix == null || prefix.length == 0) {
            throw new IllegalArgumentException("Prefix array must not be null or empty");
        }
        if (left < 0 || right < left || right >= prefix.length - 1) {
            throw new IndexOutOfBoundsException("Invalid inclusive range");
        }
        return prefix[right + 1] - prefix[left];
    }
}
