import java.util.*;
/** O(n log n) longest strictly increasing subsequence length. */
public class LongestIncreasingSubsequence {
    public static int length(int[] nums) {
        int[] tails = new int[nums.length]; int size = 0;
        for (int n : nums) {
            int lo = 0, hi = size;
            while (lo < hi) { int mid = (lo + hi) >>> 1; if (tails[mid] < n) lo = mid + 1; else hi = mid; }
            tails[lo] = n; if (lo == size) size++;
        }
        return size;
    }
    public static void main(String[] args) {
        System.out.println(length(new int[]{10,9,2,5,3,7,101,18})); // 4
    }
}