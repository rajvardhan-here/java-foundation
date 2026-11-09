import java.util.Arrays;

/** Returns the fewest coins needed to form an amount, or -1 if impossible. */
public class CoinChange {
    public static int minCoins(int[] coins, int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        if (coins == null) throw new IllegalArgumentException("Coins cannot be null");

        int unreachable = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, unreachable);
        dp[0] = 0;

        for (int current = 1; current <= amount; current++) {
            for (int coin : coins) {
                if (coin <= 0) {
                    throw new IllegalArgumentException("Coin values must be positive");
                }
                if (coin <= current && dp[current - coin] != unreachable) {
                    dp[current] = Math.min(dp[current], dp[current - coin] + 1);
                }
            }
        }
        return dp[amount] == unreachable ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(minCoins(new int[]{1, 2, 5}, 11)); // 3
        System.out.println(minCoins(new int[]{2}, 3));        // -1
    }
}
