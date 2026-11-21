public class Knapsack01 {
    static int maxValue(int[] weights, int[] values, int capacity) {
        int[] dp = new int[capacity + 1];
        for (int i = 0; i < weights.length; i++)
            for (int c = capacity; c >= weights[i]; c--)
                dp[c] = Math.max(dp[c], values[i] + dp[c - weights[i]]);
        return dp[capacity];
    }
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{1, 3, 4, 5}, new int[]{1, 4, 5, 7}, 7));
    }
}