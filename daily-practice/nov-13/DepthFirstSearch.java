import java.util.ArrayList;
import java.util.List;
/** Iterative depth-first traversal avoids recursion-stack growth. */
public class DepthFirstSearch {
    static List<Integer> traverse(List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[graph.size()];
        List<Integer> order = new ArrayList<>();
        List<Integer> stack = new ArrayList<>(); stack.add(start);
        while (!stack.isEmpty()) {
            int node = stack.remove(stack.size() - 1);
            if (visited[node]) continue;
            visited[node] = true; order.add(node);
            List<Integer> neighbors = graph.get(node);
            for (int i = neighbors.size() - 1; i >= 0; i--)
                if (!visited[neighbors.get(i)]) stack.add(neighbors.get(i));
        }
        return order;
    }
    public static void main(String[] args) {
        List<List<Integer>> g = List.of(List.of(1, 2), List.of(0, 3), List.of(0), List.of(1));
        System.out.println(traverse(g, 0));
    }
}