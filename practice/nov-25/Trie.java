/** Prefix tree for lowercase English words. */
public class Trie {
    private static class Node {
        Node[] children = new Node[26];
        boolean terminal;
    }

    private final Node root = new Node();

    public void insert(String word) {
        if (word == null) throw new IllegalArgumentException("word must not be null");
        Node node = root;
        for (char ch : word.toCharArray()) {
            int index = indexOf(ch);
            if (node.children[index] == null) node.children[index] = new Node();
            node = node.children[index];
        }
        node.terminal = true;
    }

    public boolean search(String word) {
        Node node = findNode(word);
        return node != null && node.terminal;
    }

    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }

    private Node findNode(String text) {
        if (text == null) throw new IllegalArgumentException("text must not be null");
        Node node = root;
        for (char ch : text.toCharArray()) {
            node = node.children[indexOf(ch)];
            if (node == null) return null;
        }
        return node;
    }

    private int indexOf(char ch) {
        if (ch < 'a' || ch > 'z') throw new IllegalArgumentException("Use lowercase a-z only");
        return ch - 'a';
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("java");
        if (!trie.search("java") || trie.search("jav") || !trie.startsWith("jav")) {
            throw new AssertionError("Trie checks failed");
        }
        System.out.println("Trie checks passed");
    }
}