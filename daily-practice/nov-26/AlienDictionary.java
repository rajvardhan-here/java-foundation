import java.util.*;

/** Derives a valid character order from a sorted dictionary of an unknown alphabet. */
public class AlienDictionary {
    public static String order(String[] words) {
        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();
        for (String word : words) for (char c : word.toCharArray()) {
            graph.putIfAbsent(c, new HashSet<>()); indegree.putIfAbsent(c, 0);
        }
        for (int i = 0; i + 1 < words.length; i++) {
            String a = words[i], b = words[i + 1];
            int len = Math.min(a.length(), b.length()), j = 0;
            while (j < len && a.charAt(j) == b.charAt(j)) j++;
            if (j == len) {
                if (a.length() > b.length()) return "";
            } else if (graph.get(a.charAt(j)).add(b.charAt(j))) indegree.put(b.charAt(j), indegree.get(b.charAt(j)) + 1);
        }
        Queue<Character> q = new PriorityQueue<>();
        for (char c : indegree.keySet()) if (indegree.get(c) == 0) q.add(c);
        StringBuilder result = new StringBuilder();
        while (!q.isEmpty()) {
            char c = q.remove(); result.append(c);
            for (char next : graph.get(c)) {
                indegree.put(next, indegree.get(next) - 1);
                if (indegree.get(next) == 0) q.add(next);
            }
        }
        return result.length() == indegree.size() ? result.toString() : "";
    }
    public static void main(String[] args) {
        System.out.println(order(new String[]{"wrt","wrf","er","ett","rftt"})); // wertf
    }
}