import java.util.ArrayList;
import java.util.List;

/**
 * Detects a cycle in a directed graph using three DFS states.
 * Time: O(V + E), Space: O(V + E).
 */
public class DetectCycleDirectedGraph {
    private static final int UNVISITED = 0;
    private static final int VISITING = 1;
    private static final int VISITED = 2;

    public static boolean hasCycle(int vertices, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) graph.add(new ArrayList<>());

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }

        int[] state = new int[vertices];
        for (int vertex = 0; vertex < vertices; vertex++) {
            if (state[vertex] == UNVISITED && dfs(vertex, graph, state)) {
                return true;
            }
        }
        return false;
    }

    private static boolean dfs(int vertex, List<List<Integer>> graph, int[] state) {
        state[vertex] = VISITING;

        for (int neighbor : graph.get(vertex)) {
            if (state[neighbor] == VISITING) return true;
            if (state[neighbor] == UNVISITED && dfs(neighbor, graph, state)) {
                return true;
            }
        }

        state[vertex] = VISITED;
        return false;
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}, {2, 3}};
        System.out.println("Contains cycle: " + hasCycle(4, edges)); // true
    }
}
