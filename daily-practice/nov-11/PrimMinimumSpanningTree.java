import java.util.*;

/** Prim's algorithm for a connected, undirected weighted graph. */
public class PrimMinimumSpanningTree {
    static int minimumCost(List<List<int[]>> graph) {
        int n = graph.size();
        if (n == 0) return 0;
        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{0, 0});
        int total = 0, count = 0;

        while (!pq.isEmpty()) {
            int[] edge = pq.poll();
            int node = edge[0], weight = edge[1];
            if (visited[node]) continue;
            visited[node] = true;
            total += weight;
            count++;
            for (int[] next : graph.get(node))
                if (!visited[next[0]]) pq.offer(new int[]{next[0], next[1]});
        }
        if (count != n) throw new IllegalArgumentException("Graph is disconnected");
        return total;
    }

    public static void main(String[] args) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < 4; i++) graph.add(new ArrayList<>());
        add(graph, 0, 1, 10); add(graph, 0, 2, 6);
        add(graph, 0, 3, 5); add(graph, 1, 3, 15); add(graph, 2, 3, 4);
        System.out.println(minimumCost(graph)); // 19
    }

    private static void add(List<List<int[]>> g, int a, int b, int w) {
        g.get(a).add(new int[]{b, w}); g.get(b).add(new int[]{a, w});
    }
}