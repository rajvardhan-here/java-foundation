import java.util.HashMap;
import java.util.Map;

/** Finds the length of the longest substring containing unique characters. */
public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String text) {
        if (text == null) throw new IllegalArgumentException("text must not be null");
        Map<Character, Integer> lastSeen = new HashMap<>();
        int start = 0, best = 0;
        for (int end = 0; end < text.length(); end++) {
            char ch = text.charAt(end);
            if (lastSeen.containsKey(ch)) {
                start = Math.max(start, lastSeen.get(ch) + 1);
            }
            lastSeen.put(ch, end);
            best = Math.max(best, end - start + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        if (lengthOfLongestSubstring("abcabcbb") != 3
                || lengthOfLongestSubstring("bbbbb") != 1
                || lengthOfLongestSubstring("") != 0) {
            throw new AssertionError("Sliding window checks failed");
        }
        System.out.println("LongestSubstring checks passed");
    }
}