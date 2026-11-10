/**
 * Maximum money that can be robbed without choosing adjacent houses.
 * Time: O(n), Space: O(1).
 */
public class HouseRobber {
    public static int rob(int[] money) {
        if (money == null || money.length == 0) return 0;

        int twoBack = 0;
        int oneBack = 0;

        for (int amount : money) {
            int current = Math.max(oneBack, twoBack + amount);
            twoBack = oneBack;
            oneBack = current;
        }
        return oneBack;
    }

    public static void main(String[] args) {
        int[] houses = {2, 7, 9, 3, 1};
        System.out.println("Maximum loot: " + rob(houses)); // 12
    }
}
