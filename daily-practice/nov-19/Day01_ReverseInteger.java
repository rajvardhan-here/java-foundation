public class Day01_ReverseInteger {
    public static int reverse(int number) {
        long value = 0;
        int n = number;
        while (n != 0) {
            value = value * 10 + n % 10;
            n /= 10;
            if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) return 0;
        }
        return (int) value;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-120)); // -21
    }
}