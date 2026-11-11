import java.util.*;

/** Iterative DFS avoids recursion-depth limits on large graphs. */
public class DepthFirstSearchIterative {
    static List<Integer> dfs(List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[graph.size()];
        List<Integer> order = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (visited[node]) continue;
            visited[node] = true;
            order.add(node);
            List<Integer> neighbors = graph.get(node);
            for (int i = neighbors.size() - 1; i >= 0; i--) {
                int next = neighbors.get(i);
                if (!visited[next]) stack.push(next);
            }
        }
        return order;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = List.of(
            List.of(1, 2), List.of(0, 3), List.of(0, 3), List.of(1, 2)
        );
        System.out.println(dfs(graph, 0));
    }
}