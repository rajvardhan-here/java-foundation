public class Day03_LCM {
    public static long gcd(long a, long b) {
        while (b != 0) { long r = a % b; a = b; b = r; }
        return Math.abs(a);
    }
    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs((a / gcd(a, b)) * b);
    }
    public static void main(String[] args) {
        System.out.println(lcm(12, 18)); // 36
    }
}