/** Manacher's algorithm: longest palindromic substring in O(n) time. */
public class ManacherLongestPalindrome {
    public static String longestPalindrome(String s) {
        if (s.isEmpty()) return "";
        StringBuilder t = new StringBuilder("^");
        for (int i = 0; i < s.length(); i++) t.append("#").append(s.charAt(i));
        t.append("#$");
        int[] radius = new int[t.length()];
        int center = 0, right = 0, bestCenter = 0, bestLength = 0;
        for (int i = 1; i < t.length() - 1; i++) {
            int mirror = 2 * center - i;
            if (i < right) radius[i] = Math.min(right - i, radius[mirror]);
            while (t.charAt(i + 1 + radius[i]) == t.charAt(i - 1 - radius[i])) radius[i]++;
            if (i + radius[i] > right) { center = i; right = i + radius[i]; }
            if (radius[i] > bestLength) { bestLength = radius[i]; bestCenter = i; }
        }
        int start = (bestCenter - bestLength) / 2;
        return s.substring(start, start + bestLength);
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // bab or aba
    }
}