import java.util.*;

/** Floyd-Warshall computes shortest paths between every pair of vertices. */
public class FloydWarshall {
    static final int INF = 1_000_000_000;

    static void allPairsShortestPaths(int[][] dist) {
        int n = dist.length;
        for (int via = 0; via < n; via++) {
            for (int from = 0; from < n; from++) {
                if (dist[from][via] == INF) continue;
                for (int to = 0; to < n; to++) {
                    if (dist[via][to] == INF) continue;
                    dist[from][to] = Math.min(dist[from][to],
                                              dist[from][via] + dist[via][to]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] dist = {{0, 3, INF}, {INF, 0, 2}, {1, INF, 0}};
        allPairsShortestPaths(dist);
        for (int[] row : dist) System.out.println(Arrays.toString(row));
    }
}