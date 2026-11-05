public class ArrayAlgorithms {

    private ArrayAlgorithms() {
        // Utility class; instances are not required.
    }

    // Returns prefix sums where prefix[i] is the sum of values[0..i].
    public static int[] prefixSums(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int[] prefix = new int[values.length];
        if (values.length == 0) {
            return prefix;
        }

        prefix[0] = values[0];
        for (int i = 1; i < values.length; i++) {
            prefix[i] = prefix[i - 1] + values[i];
        }
        return prefix;
    }

    // Returns the sum of values from left to right, both indices inclusive.
    public static int rangeSum(int[] prefix, int left, int right) {
        if (prefix == null || left < 0 || right < left || right >= prefix.length) {
            throw new IllegalArgumentException("Invalid prefix array or range");
        }

        return left == 0 ? prefix[right] : prefix[right] - prefix[left - 1];
    }

    // Kadane's algorithm: maximum sum among all non-empty contiguous subarrays.
    public static int maxSubarraySum(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Input must contain at least one value");
        }

        int currentSum = values[0];
        int bestSum = values[0];

        for (int i = 1; i < values.length; i++) {
            currentSum = Math.max(values[i], currentSum + values[i]);
            bestSum = Math.max(bestSum, currentSum);
        }
        return bestSum;
    }
}
