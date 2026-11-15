public class Day05_PalindromeNumber {
    static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}