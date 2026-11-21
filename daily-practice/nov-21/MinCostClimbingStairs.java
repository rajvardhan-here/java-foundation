public class MinCostClimbingStairs {
    static int minCost(int[] cost) {
        int twoBack = 0, oneBack = 0;
        for (int i = 2; i <= cost.length; i++) {
            int current = Math.min(oneBack + cost[i - 1], twoBack + cost[i - 2]);
            twoBack = oneBack; oneBack = current;
        }
        return oneBack;
    }
    public static void main(String[] args) {
        System.out.println(minCost(new int[]{10, 15, 20}));
    }
}