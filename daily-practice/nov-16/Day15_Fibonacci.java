public class Day15_Fibonacci {
    static long fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n < 2) return n;
        long previous = 0, current = 1;
        for (int i = 2; i <= n; i++) {
            long next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
