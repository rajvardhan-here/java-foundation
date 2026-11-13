/** Maximum non-adjacent sum; supports negative values by choosing no house. */
public class HouseRobber {
    static int rob(int[] money) {
        int twoBack = 0, oneBack = 0;
        for (int value : money) {
            int current = Math.max(oneBack, twoBack + value);
            twoBack = oneBack; oneBack = current;
        }
        return oneBack;
    }
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2, 7, 9, 3, 1}));
    }
}