import java.util.Arrays;

/** Minimum number of coins needed to make an amount using unlimited denominations. */
public class CoinChange {
    public static int minCoins(int[] coins, int amount) {
        if (coins == null || amount < 0) throw new IllegalArgumentException();
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins) {
            if (coin <= 0) throw new IllegalArgumentException("Coins must be positive");
            for (int value = coin; value <= amount; value++) {
                dp[value] = Math.min(dp[value], dp[value - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        if (minCoins(new int[]{1, 2, 5}, 11) != 3
                || minCoins(new int[]{2}, 3) != -1) {
            throw new AssertionError("Coin change checks failed");
        }
        System.out.println("CoinChange checks passed");
    }
}