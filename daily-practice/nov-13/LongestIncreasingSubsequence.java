import java.util.Arrays;
/** O(n log n) length of the longest strictly increasing subsequence. */
public class LongestIncreasingSubsequence {
    static int length(int[] a) {
        int[] tails = new int[a.length]; int size = 0;
        for (int value : a) {
            int left = 0, right = size;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] < value) left = mid + 1; else right = mid;
            }
            tails[left] = value;
            if (left == size) size++;
        }
        return size;
    }
    public static void main(String[] args) {
        System.out.println(length(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}