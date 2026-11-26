import java.util.*;

/** Kosaraju's two-pass algorithm for strongly connected components. */
public class KosarajuSCC {
    private static void dfs(int v, List<List<Integer>> graph, boolean[] seen, Deque<Integer> order) {
        seen[v] = true;
        for (int next : graph.get(v)) if (!seen[next]) dfs(next, graph, seen, order);
        order.push(v);
    }
    private static void collect(int v, List<List<Integer>> reverse, boolean[] seen, List<Integer> component) {
        seen[v] = true; component.add(v);
        for (int next : reverse.get(v)) if (!seen[next]) collect(next, reverse, seen, component);
    }
    public static List<List<Integer>> components(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>(), reverse = new ArrayList<>();
        for (int i = 0; i < n; i++) { graph.add(new ArrayList<>()); reverse.add(new ArrayList<>()); }
        for (int[] e : edges) { graph.get(e[0]).add(e[1]); reverse.get(e[1]).add(e[0]); }
        boolean[] seen = new boolean[n]; Deque<Integer> order = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (!seen[i]) dfs(i, graph, seen, order);
        Arrays.fill(seen, false); List<List<Integer>> result = new ArrayList<>();
        while (!order.isEmpty()) {
            int v = order.pop();
            if (!seen[v]) { List<Integer> part = new ArrayList<>(); collect(v, reverse, seen, part); result.add(part); }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] edges = {{0,1},{1,2},{2,0},{1,3},{3,4},{4,3}};
        System.out.println(components(5, edges)); // two SCCs
    }
}