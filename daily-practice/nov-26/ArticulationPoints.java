import java.util.*;

/** Finds articulation points in an undirected graph using DFS low-link values. */
public class ArticulationPoints {
    private List<List<Integer>> graph;
    private int[] tin, low;
    private boolean[] cut;
    private int timer;
    private void dfs(int u, int parent) {
        tin[u] = low[u] = ++timer;
        int children = 0;
        for (int v : graph.get(u)) {
            if (v == parent) continue;
            if (tin[v] != 0) low[u] = Math.min(low[u], tin[v]);
            else {
                dfs(v, u); low[u] = Math.min(low[u], low[v]); children++;
                if (parent != -1 && low[v] >= tin[u]) cut[u] = true;
            }
        }
        if (parent == -1 && children > 1) cut[u] = true;
    }
    public List<Integer> find(int n, int[][] edges) {
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) { graph.get(e[0]).add(e[1]); graph.get(e[1]).add(e[0]); }
        tin = new int[n]; low = new int[n]; cut = new boolean[n]; timer = 0;
        for (int i = 0; i < n; i++) if (tin[i] == 0) dfs(i, -1);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) if (cut[i]) result.add(i);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new ArticulationPoints().find(5, new int[][]{{0,1},{1,2},{2,0},{1,3},{3,4}})); // [1, 3]
    }
}