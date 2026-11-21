public class InvertBinaryTree {
    static class Node { int value; Node left, right; Node(int value) { this.value = value; } }
    static Node invert(Node root) {
        if (root == null) return null;
        Node temp = root.left; root.left = root.right; root.right = temp;
        invert(root.left); invert(root.right);
        return root;
    }
    static void printPreorder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        printPreorder(node.left); printPreorder(node.right);
    }
    public static void main(String[] args) {
        Node root = new Node(4); root.left = new Node(2); root.right = new Node(7);
        invert(root); printPreorder(root);
    }
}