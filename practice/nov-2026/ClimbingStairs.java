public class ClimbingStairs {
    public static int countWays(int n) {
        if (n < 0) throw new IllegalArgumentException("Steps cannot be negative");
        if (n <= 1) return 1;
        int previous = 1, current = 1;
        for (int step = 2; step <= n; step++) {
            int next = Math.addExact(previous, current);
            previous = current;
            current = next;
        }
        return current;
    }
    public static void main(String[] args) { System.out.println(countWays(5)); }
}
