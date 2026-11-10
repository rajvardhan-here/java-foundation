import java.util.Arrays;

/**
 * Finds the length of the longest strictly increasing subsequence.
 * Time: O(n log n), Space: O(n).
 */
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[] tails = new int[nums.length];
        int size = 0;

        for (int value : nums) {
            int left = 0, right = size;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] < value) left = mid + 1;
                else right = mid;
            }
            tails[left] = value;
            if (left == size) size++;
        }
        return size;
    }

    public static void main(String[] args) {
        int[] values = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("LIS length: " + lengthOfLIS(values)); // 4
    }
}
