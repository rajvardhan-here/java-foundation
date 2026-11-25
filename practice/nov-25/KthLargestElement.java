import java.util.PriorityQueue;

/** Finds the kth largest value using a size-k min heap. */
public class KthLargestElement {
    public static int find(int[] nums, int k) {
        if (nums == null || k < 1 || k > nums.length) {
            throw new IllegalArgumentException("k must be between 1 and array length");
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int value : nums) {
            heap.offer(value);
            if (heap.size() > k) heap.poll();
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        if (find(new int[]{3, 2, 1, 5, 6, 4}, 2) != 5) {
            throw new AssertionError("Kth largest check failed");
        }
        System.out.println("KthLargestElement checks passed");
    }
}