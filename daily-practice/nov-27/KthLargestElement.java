import java.util.*;
/** Finds the kth largest value using a size-k min heap. */
public class KthLargestElement {
    public static int find(int[] values, int k) {
        if (k < 1 || k > values.length) throw new IllegalArgumentException("Invalid k");
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int value : values) { heap.offer(value); if (heap.size() > k) heap.poll(); }
        return heap.peek();
    }
    public static void main(String[] args) {
        System.out.println(find(new int[]{3,2,1,5,6,4}, 2)); // 5
    }
}