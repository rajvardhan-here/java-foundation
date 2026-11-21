public class LowestCommonAncestor {
    static class Node { int value; Node left, right; Node(int value) { this.value = value; } }
    static Node lca(Node root, int a, int b) {
        if (root == null || root.value == a || root.value == b) return root;
        Node left = lca(root.left, a, b), right = lca(root.right, a, b);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
    public static void main(String[] args) {
        Node root = new Node(3); root.left = new Node(5); root.right = new Node(1);
        root.left.left = new Node(6); root.left.right = new Node(2);
        Node answer = lca(root, 6, 2);
        System.out.println(answer == null ? "Not found" : answer.value);
    }
}