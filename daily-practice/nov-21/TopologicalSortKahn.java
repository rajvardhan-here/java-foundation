import java.util.*;

public class TopologicalSortKahn {
    static List<Integer> sort(int vertices, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[vertices];
        for (int i = 0; i < vertices; i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) { graph.get(edge[0]).add(edge[1]); indegree[edge[1]]++; }
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < vertices; i++) if (indegree[i] == 0) queue.offer(i);
        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll(); order.add(node);
            for (int next : graph.get(node)) if (--indegree[next] == 0) queue.offer(next);
        }
        return order.size() == vertices ? order : Collections.emptyList();
    }
    public static void main(String[] args) {
        int[][] edges = {{5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1}};
        System.out.println(sort(6, edges));
    }
}