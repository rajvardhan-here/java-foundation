public class MatrixChainMultiplication {
    static long minMultiplications(int[] dimensions) {
        int n = dimensions.length - 1;
        if (n <= 1) return 0;
        long[][] dp = new long[n][n];
        for (int length = 2; length <= n; length++)
            for (int i = 0; i + length <= n; i++) {
                int j = i + length - 1; dp[i][j] = Long.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    long cost = dp[i][k] + dp[k + 1][j]
                        + (long) dimensions[i] * dimensions[k + 1] * dimensions[j + 1];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        return dp[0][n - 1];
    }
    public static void main(String[] args) {
        System.out.println(minMultiplications(new int[]{40, 20, 30, 10, 30}));
    }
}