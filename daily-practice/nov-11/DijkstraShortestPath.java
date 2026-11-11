import java.util.*;

/** Dijkstra's algorithm for graphs with non-negative edge weights. */
public class DijkstraShortestPath {
    static int[] shortestPaths(List<List<int[]>> graph, int source) {
        int[] distance = new int[graph.size()];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{source, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0], cost = current[1];
            if (cost != distance[node]) continue;
            for (int[] edge : graph.get(node)) {
                int next = edge[0], weight = edge[1];
                if (cost <= Integer.MAX_VALUE - weight && cost + weight < distance[next]) {
                    distance[next] = cost + weight;
                    pq.offer(new int[]{next, distance[next]});
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) graph.add(new ArrayList<>());
        graph.get(0).add(new int[]{1, 4}); graph.get(0).add(new int[]{2, 1});
        graph.get(2).add(new int[]{1, 2}); graph.get(1).add(new int[]{3, 1});
        graph.get(2).add(new int[]{3, 5}); graph.get(3).add(new int[]{4, 3});
        System.out.println(Arrays.toString(shortestPaths(graph, 0)));
    }
}