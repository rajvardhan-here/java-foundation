public class Day14_Factorial {
    static long factorial(int n) {
        if (n < 0 || n > 20) throw new IllegalArgumentException("n must be between 0 and 20");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
