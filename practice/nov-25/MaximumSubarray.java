/** Kadane's algorithm for the maximum-sum contiguous subarray. */
public class MaximumSubarray {
    public static int maxSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("A non-empty array is required");
        }
        int current = nums[0], best = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(best, current);
        }
        return best;
    }

    public static void main(String[] args) {
        if (maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}) != 6
                || maxSum(new int[]{-3, -1, -2}) != -1) {
            throw new AssertionError("Maximum subarray checks failed");
        }
        System.out.println("MaximumSubarray checks passed");
    }
}