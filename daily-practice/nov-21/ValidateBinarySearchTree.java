public class ValidateBinarySearchTree {
    static class Node { int value; Node left, right; Node(int value) { this.value = value; } }
    static boolean isValid(Node root) { return validate(root, Long.MIN_VALUE, Long.MAX_VALUE); }
    private static boolean validate(Node node, long low, long high) {
        if (node == null) return true;
        if (node.value <= low || node.value >= high) return false;
        return validate(node.left, low, node.value) && validate(node.right, node.value, high);
    }
    public static void main(String[] args) {
        Node root = new Node(5); root.left = new Node(3); root.right = new Node(8);
        System.out.println(isValid(root));
    }
}