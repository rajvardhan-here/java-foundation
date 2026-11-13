/** Kadane's algorithm: maximum sum over any non-empty contiguous subarray. */
public class MaximumSubarray {
    static int maxSum(int[] a) {
        if (a.length == 0) throw new IllegalArgumentException("Array must not be empty");
        int best = a[0], current = a[0];
        for (int i = 1; i < a.length; i++) {
            current = Math.max(a[i], current + a[i]);
            best = Math.max(best, current);
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}