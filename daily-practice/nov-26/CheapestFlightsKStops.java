import java.util.*;

/** Bellman-Ford style relaxation for the cheapest route with at most k stops. */
public class CheapestFlightsKStops {
    public static int find(int n, int[][] flights, int src, int dst, int k) {
        int inf = Integer.MAX_VALUE / 4;
        int[] cost = new int[n]; Arrays.fill(cost, inf); cost[src] = 0;
        for (int i = 0; i <= k; i++) {
            int[] next = cost.clone();
            for (int[] f : flights)
                if (cost[f[0]] != inf) next[f[1]] = Math.min(next[f[1]], cost[f[0]] + f[2]);
            cost = next;
        }
        return cost[dst] == inf ? -1 : cost[dst];
    }
    public static void main(String[] args) {
        int[][] flights = {{0,1,100},{1,2,100},{0,2,500}};
        System.out.println(find(3, flights, 0, 2, 1)); // 200
    }
}