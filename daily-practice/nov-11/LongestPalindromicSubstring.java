/** Finds a longest palindromic substring in O(n^2) time and O(1) space. */
public class LongestPalindromicSubstring {
    static String longestPalindrome(String text) {
        if (text == null || text.isEmpty()) return "";
        int bestStart = 0, bestLength = 1;
        for (int center = 0; center < text.length(); center++) {
            int odd = expand(text, center, center);
            int even = expand(text, center, center + 1);
            int length = Math.max(odd, even);
            if (length > bestLength) {
                bestLength = length;
                bestStart = center - (length - 1) / 2;
            }
        }
        return text.substring(bestStart, bestStart + bestLength);
    }

    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // bab or aba
    }
}