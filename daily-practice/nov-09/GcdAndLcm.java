/** Computes greatest common divisor and least common multiple. */
public class GcdAndLcm {
    public static long gcd(long first, long second) {
        first = Math.abs(first);
        second = Math.abs(second);
        while (second != 0) {
            long remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }

    public static long lcm(long first, long second) {
        if (first == 0 || second == 0) return 0;
        return Math.abs((first / gcd(first, second)) * second);
    }

    public static void main(String[] args) {
        System.out.println(gcd(48, 18)); // 6
        System.out.println(lcm(12, 18)); // 36
    }
}
