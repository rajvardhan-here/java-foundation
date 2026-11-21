public class KMPStringSearch {
    static int indexOf(String text, String pattern) {
        if (pattern.isEmpty()) return 0;
        int[] lps = buildLps(pattern);
        int i = 0, j = 0;
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) { i++; j++; }
            if (j == pattern.length()) return i - j;
            if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) j = lps[j - 1]; else i++;
            }
        }
        return -1;
    }
    private static int[] buildLps(String p) {
        int[] lps = new int[p.length()];
        for (int i = 1, len = 0; i < p.length();) {
            if (p.charAt(i) == p.charAt(len)) lps[i++] = ++len;
            else if (len > 0) len = lps[len - 1]; else lps[i++] = 0;
        }
        return lps;
    }
    public static void main(String[] args) {
        System.out.println(indexOf("abxabcabcaby", "abcaby"));
    }
}