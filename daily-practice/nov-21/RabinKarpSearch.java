public class RabinKarpSearch {
    static int indexOf(String text, String pattern) {
        int n = text.length(), m = pattern.length();
        if (m == 0) return 0;
        if (m > n) return -1;
        final int base = 256, mod = 1_000_000_007;
        long power = 1, target = 0, window = 0;
        for (int i = 0; i < m; i++) {
            target = (target * base + pattern.charAt(i)) % mod;
            window = (window * base + text.charAt(i)) % mod;
            if (i < m - 1) power = power * base % mod;
        }
        for (int start = 0; start <= n - m; start++) {
            if (target == window && text.regionMatches(start, pattern, 0, m)) return start;
            if (start < n - m) {
                window = (window - text.charAt(start) * power % mod + mod) % mod;
                window = (window * base + text.charAt(start + m)) % mod;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(indexOf("hello algorithm world", "algorithm"));
    }
}