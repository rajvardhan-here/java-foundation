/** Finds the shortest substring of source containing all characters of target. */
public class MinimumWindowSubstring {
    public static String find(String source, String target) {
        if (source == null || target == null) throw new IllegalArgumentException("Inputs cannot be null");
        if (target.isEmpty() || source.length() < target.length()) return "";
        int[] need = new int[Character.MAX_VALUE + 1];
        for (char ch : target.toCharArray()) need[ch]++;
        int missing = target.length(), left = 0, bestStart = 0, bestLength = Integer.MAX_VALUE;
        for (int right = 0; right < source.length(); right++) {
            char added = source.charAt(right);
            if (need[added] > 0) missing--;
            need[added]--;
            while (missing == 0) {
                int length = right - left + 1;
                if (length < bestLength) { bestLength = length; bestStart = left; }
                char removed = source.charAt(left++);
                need[removed]++;
                if (need[removed] > 0) missing++;
            }
        }
        return bestLength == Integer.MAX_VALUE ? "" : source.substring(bestStart, bestStart + bestLength);
    }

    public static void main(String[] args) {
        if (!"BANC".equals(find("ADOBECODEBANC", "ABC"))
                || !find("abc", "z").isEmpty()) {
            throw new AssertionError("Minimum window checks failed");
        }
        System.out.println("MinimumWindowSubstring checks passed");
    }
}