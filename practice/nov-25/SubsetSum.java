/** Determines whether a subset of non-negative integers sums to target. */
public class SubsetSum {
    public static boolean exists(int[] values, int target) {
        if (values == null || target < 0) throw new IllegalArgumentException();
        boolean[] reachable = new boolean[target + 1];
        reachable[0] = true;
        for (int value : values) {
            if (value < 0) throw new IllegalArgumentException("Values must be non-negative");
            for (int sum = target; sum >= value; sum--) {
                reachable[sum] |= reachable[sum - value];
            }
        }
        return reachable[target];
    }

    public static void main(String[] args) {
        if (!exists(new int[]{3, 34, 4, 12, 5, 2}, 9)
                || exists(new int[]{2, 4, 6}, 5)) {
            throw new AssertionError("Subset sum checks failed");
        }
        System.out.println("SubsetSum checks passed");
    }
}