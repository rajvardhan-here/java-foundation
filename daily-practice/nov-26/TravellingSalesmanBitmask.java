import java.util.Arrays;

/** Bitmask dynamic programming solution for the travelling salesperson problem. */
public class TravellingSalesmanBitmask {
    private static final int INF = 1_000_000_000;
    public static int minTour(int[][] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        if (n > 20) throw new IllegalArgumentException("Bitmask DP is intended for small graphs");
        int states = 1 << n;
        int[][] dp = new int[states][n];
        for (int[] row : dp) Arrays.fill(row, INF);
        dp[1][0] = 0;
        for (int mask = 1; mask < states; mask++) {
            if ((mask & 1) == 0) continue;
            for (int u = 0; u < n; u++) if (dp[mask][u] < INF) {
                for (int v = 0; v < n; v++) if ((mask & (1 << v)) == 0) {
                    int next = mask | (1 << v);
                    dp[next][v] = Math.min(dp[next][v], dp[mask][u] + cost[u][v]);
                }
            }
        }
        int answer = INF, full = states - 1;
        for (int u = 1; u < n; u++) answer = Math.min(answer, dp[full][u] + cost[u][0]);
        return n == 1 ? 0 : answer;
    }
    public static void main(String[] args) {
        int[][] cost = {{0,10,15,20},{10,0,35,25},{15,35,0,30},{20,25,30,0}};
        System.out.println(minTour(cost)); // 80
    }
}