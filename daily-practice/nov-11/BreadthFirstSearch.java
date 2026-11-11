import java.util.*;

/** Breadth-first traversal of an unweighted graph using an adjacency list. */
public class BreadthFirstSearch {
    static List<Integer> bfs(List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[graph.size()];
        List<Integer> order = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        visited[start] = true;
        queue.offer(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            order.add(node);
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        return order;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = List.of(
            List.of(1, 2), List.of(0, 3, 4), List.of(0, 4),
            List.of(1), List.of(1, 2)
        );
        System.out.println(bfs(graph, 0)); // [0, 1, 2, 3, 4]
    }
}