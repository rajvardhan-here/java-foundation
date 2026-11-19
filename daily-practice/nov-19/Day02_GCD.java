public class Day02_GCD {
    public static int gcd(int a, int b) {
        a = Math.abs(a); b = Math.abs(b);
        while (b != 0) { int r = a % b; a = b; b = r; }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(gcd(48, 18)); // 6
    }
}