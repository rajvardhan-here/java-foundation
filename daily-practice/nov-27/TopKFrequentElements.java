import java.util.*;
/** Returns the k most frequent integers. */
public class TopKFrequentElements {
    public static List<Integer> topK(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for (int n : nums) freq.merge(n, 1, Integer::sum);
        if (k < 0 || k > freq.size()) throw new IllegalArgumentException("Invalid k");
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) ->
            freq.get(a).equals(freq.get(b)) ? Integer.compare(a,b) : Integer.compare(freq.get(a),freq.get(b)));
        for (int n : freq.keySet()) { heap.offer(n); if (heap.size() > k) heap.poll(); }
        List<Integer> result = new ArrayList<>();
        while (!heap.isEmpty()) result.add(heap.poll());
        Collections.reverse(result); return result;
    }
    public static void main(String[] args) {
        System.out.println(topK(new int[]{1,1,1,2,2,3}, 2)); // [1, 2]
    }
}