import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/** Dijkstra's shortest paths for a directed graph with non-negative edge weights. */
public class DijkstraShortestPath {
    private record Edge(int to, int weight) {}
    private record State(int node, long distance) {}

    public static long[] shortestPaths(List<List<Edge>> graph, int source) {
        if (graph == null || source < 0 || source >= graph.size()) {
            throw new IllegalArgumentException("Invalid graph or source");
        }
        long[] distance = new long[graph.size()];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[source] = 0;
        PriorityQueue<State> queue =
                new PriorityQueue<>((a, b) -> Long.compare(a.distance(), b.distance()));
        queue.offer(new State(source, 0));
        while (!queue.isEmpty()) {
            State current = queue.poll();
            if (current.distance() != distance[current.node()]) continue;
            for (Edge edge : graph.get(current.node())) {
                if (edge.weight() < 0) throw new IllegalArgumentException("Negative edge weight");
                long candidate = current.distance() + edge.weight();
                if (candidate < distance[edge.to()]) {
                    distance[edge.to()] = candidate;
                    queue.offer(new State(edge.to(), candidate));
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 4; i++) graph.add(new ArrayList<>());
        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 1));
        graph.get(2).add(new Edge(1, 2));
        graph.get(1).add(new Edge(3, 1));
        long[] distances = shortestPaths(graph, 0);
        if (!Arrays.equals(distances, new long[]{0, 3, 1, 4})) {
            throw new AssertionError(Arrays.toString(distances));
        }
        System.out.println("Dijkstra checks passed");
    }
}