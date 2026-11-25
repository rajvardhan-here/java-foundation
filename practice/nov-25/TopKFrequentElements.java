import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/** Returns the k most frequent integers. Ties are resolved by smaller value first. */
public class TopKFrequentElements {
    private record Entry(int value, int frequency) {}

    public static int[] topK(int[] nums, int k) {
        if (nums == null || k < 0) throw new IllegalArgumentException();
        Map<Integer, Integer> counts = new HashMap<>();
        for (int value : nums) counts.merge(value, 1, Integer::sum);
        if (k > counts.size()) throw new IllegalArgumentException("k exceeds distinct values");
        PriorityQueue<Entry> heap = new PriorityQueue<>((a, b) -> {
            int byFrequency = Integer.compare(a.frequency(), b.frequency());
            return byFrequency != 0 ? byFrequency : Integer.compare(b.value(), a.value());
        });
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            heap.offer(new Entry(entry.getKey(), entry.getValue()));
            if (heap.size() > k) heap.poll();
        }
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) result[i] = heap.poll().value();
        return result;
    }

    public static void main(String[] args) {
        int[] result = topK(new int[]{1, 1, 1, 2, 2, 3}, 2);
        if (result[0] != 1 || result[1] != 2) throw new AssertionError();
        System.out.println("TopKFrequentElements checks passed");
    }
}