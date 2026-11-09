/** Counts ways to reach step n using jumps of one or two steps. */
public class ClimbingStairs {
    public static long ways(int n) {
        if (n < 0) throw new IllegalArgumentException("Step count cannot be negative");
        if (n <= 1) return 1;

        long oneStepBefore = 1;
        long twoStepsBefore = 1;
        for (int step = 2; step <= n; step++) {
            long current = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = current;
        }
        return oneStepBefore;
    }

    public static void main(String[] args) {
        System.out.println(ways(5)); // 8
        System.out.println(ways(0)); // 1
    }
}
