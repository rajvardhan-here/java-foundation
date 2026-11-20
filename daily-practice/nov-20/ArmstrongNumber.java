public class ArmstrongNumber {
    static boolean isArmstrong(int number) {
        if (number < 0) return false;
        int digits = String.valueOf(number).length();
        int remaining = number, sum = 0;
        do {
            int digit = remaining % 10;
            sum += (int) Math.pow(digit, digits);
            remaining /= 10;
        } while (remaining > 0);
        return sum == number;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(123));
    }
}