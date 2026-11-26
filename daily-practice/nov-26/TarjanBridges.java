import java.util.*;

/** Finds bridges (critical undirected edges) using Tarjan low-link values. */
public class TarjanBridges {
    private final List<List<Integer>> graph;
    private final int[] discovery, low;
    private int time;
    private final List<String> bridges = new ArrayList<>();
    private TarjanBridges(int n) {
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        discovery = new int[n]; low = new int[n];
    }
    private void addEdge(int u, int v) { graph.get(u).add(v); graph.get(v).add(u); }
    private void dfs(int u, int parent) {
        discovery[u] = low[u] = ++time;
        for (int v : graph.get(u)) {
            if (v == parent) continue;
            if (discovery[v] == 0) {
                dfs(v, u); low[u] = Math.min(low[u], low[v]);
                if (low[v] > discovery[u]) bridges.add(u + " - " + v);
            } else low[u] = Math.min(low[u], discovery[v]);
        }
    }
    public static List<String> find(int n, int[][] edges) {
        TarjanBridges solver = new TarjanBridges(n);
        for (int[] e : edges) solver.addEdge(e[0], e[1]);
        for (int i = 0; i < n; i++) if (solver.discovery[i] == 0) solver.dfs(i, -1);
        return solver.bridges;
    }
    public static void main(String[] args) {
        System.out.println(find(5, new int[][]{{0,1},{1,2},{2,0},{1,3},{3,4}})); // [3 - 4, 1 - 3]
    }
}