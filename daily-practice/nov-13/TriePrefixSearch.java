/** Trie supporting lowercase English words, exact lookup, and prefix lookup. */
public class TriePrefixSearch {
    private static class Node { Node[] next = new Node[26]; boolean word; }
    private final Node root = new Node();
    void insert(String value) {
        Node node = root;
        for (char c : value.toCharArray()) {
            if (c < 'a' || c > 'z') throw new IllegalArgumentException("Use lowercase a-z");
            int index = c - 'a';
            if (node.next[index] == null) node.next[index] = new Node();
            node = node.next[index];
        }
        node.word = true;
    }
    boolean startsWith(String prefix) {
        Node node = root;
        for (char c : prefix.toCharArray()) {
            if (c < 'a' || c > 'z' || node.next[c - 'a'] == null) return false;
            node = node.next[c - 'a'];
        }
        return true;
    }
    boolean search(String word) {
        Node node = root;
        for (char c : word.toCharArray()) {
            if (c < 'a' || c > 'z' || node.next[c - 'a'] == null) return false;
            node = node.next[c - 'a'];
        }
        return node.word;
    }
    public static void main(String[] args) {
        TriePrefixSearch trie = new TriePrefixSearch(); trie.insert("java");
        System.out.println(trie.search("java") + " " + trie.startsWith("jav"));
    }
}