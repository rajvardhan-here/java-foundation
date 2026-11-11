import java.util.*;

/** Bellman-Ford supports negative edges and detects reachable negative cycles. */
public class BellmanFord {
    static final int INF = Integer.MAX_VALUE;

    static int[] shortestPaths(int vertices, int[][] edges, int source) {
        int[] dist = new int[vertices];
        Arrays.fill(dist, INF);
        dist[source] = 0;

        for (int i = 1; i < vertices; i++) {
            boolean changed = false;
            for (int[] edge : edges) {
                int from = edge[0], to = edge[1], weight = edge[2];
                if (dist[from] != INF && dist[from] + weight < dist[to]) {
                    dist[to] = dist[from] + weight;
                    changed = true;
                }
            }
            if (!changed) break;
        }
        for (int[] edge : edges) {
            int from = edge[0], to = edge[1], weight = edge[2];
            if (dist[from] != INF && dist[from] + weight < dist[to])
                throw new IllegalArgumentException("Reachable negative-weight cycle");
        }
        return dist;
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1, 4}, {0, 2, 5}, {1, 2, -2}, {2, 3, 3}};
        System.out.println(Arrays.toString(shortestPaths(4, edges, 0)));
    }
}