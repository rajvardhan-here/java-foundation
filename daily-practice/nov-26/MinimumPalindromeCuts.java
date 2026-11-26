/** Minimum cuts needed to partition a string into palindromic substrings. */
public class MinimumPalindromeCuts {
    public static int minCuts(String s) {
        int n = s.length();
        if (n == 0) return 0;
        boolean[][] palindrome = new boolean[n][n];
        int[] cuts = new int[n];
        for (int end = 0; end < n; end++) {
            cuts[end] = end;
            for (int start = 0; start <= end; start++) {
                if (s.charAt(start) == s.charAt(end) &&
                    (end - start < 2 || palindrome[start + 1][end - 1])) {
                    palindrome[start][end] = true;
                    cuts[end] = start == 0 ? 0 : Math.min(cuts[end], cuts[start - 1] + 1);
                }
            }
        }
        return cuts[n - 1];
    }
    public static void main(String[] args) {
        System.out.println(minCuts("aab")); // 1
        System.out.println(minCuts("racecar")); // 0
    }
}