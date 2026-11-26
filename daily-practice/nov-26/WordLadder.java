import java.util.*;

/** Shortest transformation length where each step changes one character. */
public class WordLadder {
    public static int shortestLength(String begin, String end, List<String> words) {
        if (begin.equals(end)) return 1;
        Set<String> remaining = new HashSet<>(words);
        if (!remaining.contains(end)) return 0;
        Queue<String> queue = new ArrayDeque<>(); queue.add(begin);
        Set<String> seen = new HashSet<>(); seen.add(begin);
        int depth = 1;
        while (!queue.isEmpty()) {
            for (int count = queue.size(); count > 0; count--) {
                String word = queue.remove();
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char original = chars[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == original) continue;
                        chars[i] = c; String next = new String(chars);
                        if (next.equals(end)) return depth + 1;
                        if (remaining.contains(next) && seen.add(next)) queue.add(next);
                    }
                    chars[i] = original;
                }
            }
            depth++;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(shortestLength("hit", "cog", Arrays.asList("hot","dot","dog","lot","log","cog"))); // 5
    }
}