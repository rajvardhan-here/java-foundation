/** Trie supports efficient word insertion, exact search, and prefix search. */
public class TriePrefixSearch {
    private static class Node {
        Node[] children = new Node[26];
        boolean isWord;
    }
    private final Node root = new Node();

    public void insert(String word) {
        Node node = root;
        for (char ch : word.toLowerCase().toCharArray()) {
            if (ch < 'a' || ch > 'z') throw new IllegalArgumentException("Use letters a-z");
            int index = ch - 'a';
            if (node.children[index] == null) node.children[index] = new Node();
            node = node.children[index];
        }
        node.isWord = true;
    }

    private Node findNode(String text) {
        Node node = root;
        for (char ch : text.toLowerCase().toCharArray()) {
            if (ch < 'a' || ch > 'z') return null;
            node = node.children[ch - 'a'];
            if (node == null) return null;
        }
        return node;
    }

    public boolean search(String word) {
        Node node = findNode(word);
        return node != null && node.isWord;
    }
    public boolean startsWith(String prefix) { return findNode(prefix) != null; }

    public static void main(String[] args) {
        TriePrefixSearch trie = new TriePrefixSearch();
        trie.insert("java"); trie.insert("javascript");
        System.out.println(trie.search("java")); // true
        System.out.println(trie.startsWith("javas")); // true
    }
}