public class Day14_LeapYear {
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024)); // true
    }
}