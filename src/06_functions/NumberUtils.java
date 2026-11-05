public class NumberUtils {

    private NumberUtils() {
        // Utility class.
    }

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
        if (first == 0 || second == 0) {
            return 0;
        }
        return Math.multiplyExact(Math.abs(first / gcd(first, second)),
                                  Math.abs(second));
    }

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            result = Math.multiplyExact(result, i);
        }
        return result;
    }
}
