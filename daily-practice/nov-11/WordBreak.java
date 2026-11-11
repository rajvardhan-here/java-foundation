import java.util.*;

/** Determines whether a string can be segmented using dictionary words. */
public class WordBreak {
    static boolean canBreak(String text, Set<String> dictionary) {
        boolean[] reachable = new boolean[text.length() + 1];
        reachable[0] = true;
        for (int end = 1; end <= text.length(); end++) {
            for (int start = 0; start < end; start++) {
                if (reachable[start] && dictionary.contains(text.substring(start, end))) {
                    reachable[end] = true;
                    break;
                }
            }
        }
        return reachable[text.length()];
    }

    public static void main(String[] args) {
        Set<String> words = new HashSet<>(Arrays.asList("leet", "code"));
        System.out.println(canBreak("leetcode", words)); // true
    }
}