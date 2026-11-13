import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
/** Traverses a graph from a start vertex using breadth-first search. */
public class BreadthFirstSearch {
    static List<Integer> traverse(List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[graph.size()];
        List<Integer> order = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        visited[start] = true; queue.offer(start);
        while (!queue.isEmpty()) {
            int node = queue.poll(); order.add(node);
            for (int next : graph.get(node)) if (!visited[next]) {
                visited[next] = true; queue.offer(next);
            }
        }
        return order;
    }
    public static void main(String[] args) {
        List<List<Integer>> g = List.of(List.of(1, 2), List.of(0, 3), List.of(0), List.of(1));
        System.out.println(traverse(g, 0));
    }
}