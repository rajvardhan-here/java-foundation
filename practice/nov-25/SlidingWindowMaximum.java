import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/** Returns the maximum value in every window of size k in O(n) time. */
public class SlidingWindowMaximum {
    public static int[] maxInWindows(int[] nums, int k) {
        if (nums == null || k < 1 || k > nums.length) {
            throw new IllegalArgumentException("Invalid window size");
        }
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) deque.removeFirst();
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) deque.removeLast();
            deque.addLast(i);
            if (i >= k - 1) result[i - k + 1] = nums[deque.peekFirst()];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = maxInWindows(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        if (!Arrays.equals(result, new int[]{3, 3, 5, 5, 6, 7})) {
            throw new AssertionError(Arrays.toString(result));
        }
        System.out.println("SlidingWindowMaximum checks passed");
    }
}