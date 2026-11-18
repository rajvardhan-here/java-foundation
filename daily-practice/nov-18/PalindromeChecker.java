public class PalindromeChecker {
    static boolean isPalindrome(String value) {
        String reversed = new StringBuilder(value).reverse().toString();
        return value.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Level"));
    }
}
