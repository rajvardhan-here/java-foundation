public class Day04_CountDigits {
    public static int countDigits(int number) {
        long value = Math.abs((long) number);
        if (value == 0) return 1;
        int count = 0;
        while (value > 0) { count++; value /= 10; }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(-12045));
    }
}