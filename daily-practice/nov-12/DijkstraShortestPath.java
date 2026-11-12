import java.util.Arrays;
import java.util.PriorityQueue;

/** Dijkstra's algorithm for a graph with non-negative edge weights. */
public class DijkstraShortestPath {
    private static class Edge {
        final int node;
        final int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static int[] shortestPaths(int[][] graph, int source) {
        int n = graph.length;
        if (source < 0 || source >= n) {
            throw new IllegalArgumentException("Invalid source vertex");
        }

        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<Edge> queue = new PriorityQueue<>(
                (first, second) -> Integer.compare(first.weight, second.weight));
        queue.offer(new Edge(source, 0));

        while (!queue.isEmpty()) {
            Edge current = queue.poll();
            if (current.weight != distance[current.node]) {
                continue;
            }

            for (int next = 0; next < n; next++) {
                int edgeWeight = graph[current.node][next];
                if (edgeWeight < 0) {
                    throw new IllegalArgumentException("Negative edge weights are not supported");
                }
                if (edgeWeight == 0 || distance[current.node] == Integer.MAX_VALUE) {
                    continue;
                }

                long candidate = (long) distance[current.node] + edgeWeight;
                if (candidate < distance[next]) {
                    distance[next] = (int) candidate;
                    queue.offer(new Edge(next, distance[next]));
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 0, 0, 0},
            {4, 0, 8, 0, 0},
            {0, 8, 0, 7, 2},
            {0, 0, 7, 0, 9},
            {0, 0, 2, 9, 0}
        };
        System.out.println(Arrays.toString(shortestPaths(graph, 0)));
    }
}
