/**
 * Kadane's algorithm for the maximum non-empty subarray sum.
 * Time complexity: O(n); extra space: O(1).
 */
public final class KadaneAlgorithm {
    private KadaneAlgorithm() { }

    /** Works for mixed values and arrays containing only negative numbers. */
    public static int maxSubarraySum(int[] numbers) {
        if (numbers == null) throw new IllegalArgumentException("Input array must not be null");
        if (numbers.length == 0) throw new IllegalArgumentException("Input array must not be empty");

        int currentSum = numbers[0];
        int maxSum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
