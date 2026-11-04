/**
 * Brute-force solution for the maximum subarray sum problem.
 * Time complexity: O(n^3); extra space: O(1).
 */
public class bruteforce {
    public static int maxSubArray(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("Input array must not be null");
        if (nums.length == 0) throw new IllegalArgumentException("Input array must not be empty");

        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start; end < nums.length; end++) {
                int currentSum = 0;
                for (int index = start; index <= end; index++) currentSum += nums[index];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 3, 1};
        System.out.println("Maximum subarray sum: " + maxSubArray(nums));
    }
}
