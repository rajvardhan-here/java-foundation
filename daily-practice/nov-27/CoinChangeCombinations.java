/** Counts unordered ways to make an amount with unlimited coins. */
public class CoinChangeCombinations {
    public static long count(int[] coins, int amount) {
        if (amount < 0) throw new IllegalArgumentException("Negative amount");
        long[] dp = new long[amount+1]; dp[0]=1;
        for (int coin : coins) {
            if (coin <= 0) throw new IllegalArgumentException("Coins must be positive");
            for (int sum=coin;sum<=amount;sum++) dp[sum]+=dp[sum-coin];
        }
        return dp[amount];
    }
    public static void main(String[] args) { System.out.println(count(new int[]{1,2,5},5)); // 4 }
}