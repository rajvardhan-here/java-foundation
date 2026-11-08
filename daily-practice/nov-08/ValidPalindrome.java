/** Checks a palindrome while ignoring punctuation and letter case. */
public class ValidPalindrome {
    public static boolean isValid(String text) {
        if (text == null) return false;
        int left = 0, right = text.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) right--;
            if (Character.toLowerCase(text.charAt(left)) !=
                Character.toLowerCase(text.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("A man, a plan, a canal: Panama"));
    }
}