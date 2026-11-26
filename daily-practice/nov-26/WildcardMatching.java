/** Greedy wildcard matching where '?' matches one char and '*' matches any sequence. */
public class WildcardMatching {
    public static boolean matches(String text, String pattern) {
        int i = 0, j = 0, star = -1, retry = -1;
        while (i < text.length()) {
            if (j < pattern.length() && (pattern.charAt(j) == '?' || pattern.charAt(j) == text.charAt(i))) {
                i++; j++;
            } else if (j < pattern.length() && pattern.charAt(j) == '*') {
                star = j++; retry = i;
            } else if (star != -1) {
                j = star + 1; i = ++retry;
            } else return false;
        }
        while (j < pattern.length() && pattern.charAt(j) == '*') j++;
        return j == pattern.length();
    }
    public static void main(String[] args) {
        System.out.println(matches("adceb", "*a*b")); // true
        System.out.println(matches("acdcb", "a*c?b")); // false
    }
}