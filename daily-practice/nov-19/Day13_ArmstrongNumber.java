public class Day13_ArmstrongNumber {
    public static boolean isArmstrong(int number) {
        if (number < 0) return false;
        int digits = String.valueOf(number).length(), sum = 0, n = number;
        do {
            int digit = n % 10, power = 1;
            for (int i = 0; i < digits; i++) power *= digit;
            sum += power; n /= 10;
        } while (n != 0);
        return sum == number;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // true
    }
}