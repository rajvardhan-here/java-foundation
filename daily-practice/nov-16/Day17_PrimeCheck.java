public class Day17_PrimeCheck {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int divisor = 2; divisor <= n / divisor; divisor++) {
            if (n % divisor == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(29));
    }
}
