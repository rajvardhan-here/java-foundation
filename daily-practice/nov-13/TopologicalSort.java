import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
/** Kahn's algorithm; throws when the directed graph contains a cycle. */
public class TopologicalSort {
    static List<Integer> sort(List<List<Integer>> graph) {
        int n = graph.size(); int[] indegree = new int[n];
        for (List<Integer> edges : graph) for (int v : edges) indegree[v]++;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (indegree[i] == 0) queue.offer(i);
        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int u = queue.poll(); order.add(u);
            for (int v : graph.get(u)) if (--indegree[v] == 0) queue.offer(v);
        }
        if (order.size() != n) throw new IllegalArgumentException("Graph contains a cycle");
        return order;
    }
    public static void main(String[] args) {
        List<List<Integer>> g = List.of(List.of(2, 3), List.of(3), List.of(), List.of());
        System.out.println(sort(g));
    }
}