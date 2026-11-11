import java.util.*;

/** Kruskal's algorithm builds a minimum spanning tree using DSU. */
public class KruskalMinimumSpanningTree {
    static class DSU {
        int[] parent, size;
        DSU(int n) {
            parent = new int[n]; size = new int[n];
            for (int i = 0; i < n; i++) { parent[i] = i; size[i] = 1; }
        }
        int find(int x) {
            if (parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }
        boolean union(int a, int b) {
            a = find(a); b = find(b);
            if (a == b) return false;
            if (size[a] < size[b]) { int t = a; a = b; b = t; }
            parent[b] = a; size[a] += size[b]; return true;
        }
    }

    static int minimumCost(int vertices, int[][] edges) {
        Arrays.sort(edges, Comparator.comparingInt(edge -> edge[2]));
        DSU dsu = new DSU(vertices);
        int total = 0, used = 0;
        for (int[] edge : edges) {
            if (dsu.union(edge[0], edge[1])) {
                total += edge[2];
                if (++used == vertices - 1) return total;
            }
        }
        if (vertices <= 1) return 0;
        if (used != vertices - 1) throw new IllegalArgumentException("Graph is disconnected");
        return total;
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1, 10}, {0, 2, 6}, {0, 3, 5}, {1, 3, 15}, {2, 3, 4}};
        System.out.println(minimumCost(4, edges)); // 19
    }
}