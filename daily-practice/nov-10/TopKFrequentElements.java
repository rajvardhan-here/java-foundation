import java.util.*;

/**
 * Returns the k values with the highest frequency.
 * Time: O(n log k), Space: O(n).
 */
public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : nums) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(frequency.get(a), frequency.get(b))
        );

        for (int value : frequency.keySet()) {
            minHeap.offer(value);
            if (minHeap.size() > k) minHeap.poll();
        }

        int size = Math.min(k, minHeap.size());
        int[] result = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] values = {1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(topKFrequent(values, 2))); // [1, 2]
    }
}
