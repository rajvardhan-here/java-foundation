import java.util.*;

/** Multi-pattern string matching with a trie and failure links. */
public class AhoCorasickMatcher {
    private static class Node {
        Map<Character, Node> next = new HashMap<>();
        Node fail;
        List<String> output = new ArrayList<>();
    }
    private final Node root = new Node();
    public AhoCorasickMatcher(List<String> patterns) {
        for (String word : patterns) {
            Node cur = root;
            for (char c : word.toCharArray()) cur = cur.next.computeIfAbsent(c, k -> new Node());
            cur.output.add(word);
        }
        buildFailures();
    }
    private void buildFailures() {
        Queue<Node> queue = new ArrayDeque<>();
        root.fail = root;
        for (Node child : root.next.values()) { child.fail = root; queue.add(child); }
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            for (Map.Entry<Character, Node> edge : node.next.entrySet()) {
                char c = edge.getKey();
                Node child = edge.getValue(), fallback = node.fail;
                while (fallback != root && !fallback.next.containsKey(c)) fallback = fallback.fail;
                if (fallback.next.containsKey(c) && fallback.next.get(c) != child) fallback = fallback.next.get(c);
                child.fail = fallback;
                child.output.addAll(fallback.output);
                queue.add(child);
            }
        }
    }
    public List<String> findMatches(String text) {
        List<String> found = new ArrayList<>();
        Node cur = root;
        for (char c : text.toCharArray()) {
            while (cur != root && !cur.next.containsKey(c)) cur = cur.fail;
            cur = cur.next.getOrDefault(c, root);
            found.addAll(cur.output);
        }
        return found;
    }
    public static void main(String[] args) {
        AhoCorasickMatcher matcher = new AhoCorasickMatcher(Arrays.asList("he", "she", "his", "hers"));
        System.out.println(matcher.findMatches("ushers")); // [she, he, hers]
    }
}