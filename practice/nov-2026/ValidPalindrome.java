public class ValidPalindrome {
    public static boolean isPalindrome(String input) {
        int left = 0, right = input.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) right--;
            if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
