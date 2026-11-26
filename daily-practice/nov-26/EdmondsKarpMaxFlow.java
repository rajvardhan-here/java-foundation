import java.util.*;

/** Edmonds-Karp maximum-flow algorithm; BFS gives O(V * E^2) complexity. */
public class EdmondsKarpMaxFlow {
    public static int maxFlow(int[][] capacity, int source, int sink) {
        int n = capacity.length;
        if (source < 0 || sink < 0 || source >= n || sink >= n || source == sink) throw new IllegalArgumentException();
        int[][] residual = new int[n][n];
        for (int i = 0; i < n; i++) residual[i] = capacity[i].clone();
        int flow = 0;
        while (true) {
            int[] parent = new int[n]; Arrays.fill(parent, -1); parent[source] = source;
            Queue<Integer> q = new ArrayDeque<>(); q.add(source);
            while (!q.isEmpty() && parent[sink] == -1) {
                int u = q.remove();
                for (int v = 0; v < n; v++)
                    if (parent[v] == -1 && residual[u][v] > 0) { parent[v] = u; q.add(v); }
            }
            if (parent[sink] == -1) return flow;
            int add = Integer.MAX_VALUE;
            for (int v = sink; v != source; v = parent[v]) add = Math.min(add, residual[parent[v]][v]);
            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v]; residual[u][v] -= add; residual[v][u] += add;
            }
            flow += add;
        }
    }
    public static void main(String[] args) {
        int[][] c = {{0,3,2,0,0,0},{0,0,0,3,0,0},{0,0,0,1,2,0},{0,0,0,0,2,2},{0,0,0,0,0,3},{0,0,0,0,0,0}};
        System.out.println(maxFlow(c, 0, 5)); // 5
    }
}