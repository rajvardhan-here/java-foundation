public class Day06_PalindromeString {
    static boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left++) != text.charAt(right--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
    }
}
