import java.util.ArrayList;
import java.util.List;

/** Finds every pattern occurrence in a text using the Z-function in linear time. */
public class ZAlgorithm {
    private static int[] zFunction(String s) {
        int[] z = new int[s.length()];
        int left = 0, right = 0;
        for (int i = 1; i < s.length(); i++) {
            if (i <= right) z[i] = Math.min(right - i + 1, z[i - left]);
            while (i + z[i] < s.length() && s.charAt(z[i]) == s.charAt(i + z[i])) z[i]++;
            if (i + z[i] - 1 > right) { left = i; right = i + z[i] - 1; }
        }
        return z;
    }
    public static List<Integer> search(String text, String pattern) {
        List<Integer> positions = new ArrayList<>();
        if (pattern.isEmpty()) {
            for (int i = 0; i <= text.length(); i++) positions.add(i);
            return positions;
        }
        String combined = pattern + "$" + text;
        int[] z = zFunction(combined);
        for (int i = pattern.length() + 1; i < combined.length(); i++)
            if (z[i] >= pattern.length()) positions.add(i - pattern.length() - 1);
        return positions;
    }
    public static void main(String[] args) {
        System.out.println(search("ababcabcab", "abc")); // [2, 5]
    }
}