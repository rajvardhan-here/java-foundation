/** Recursive factorial with input validation and long overflow guard. */
public class Factorial {
    public static long calculate(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        if (n <= 1) return 1L;
        return n * calculate(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(calculate(5));
    }
}