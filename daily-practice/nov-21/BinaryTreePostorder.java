import java.util.*;

public class BinaryTreePostorder {
    static class Node { int value; Node left, right; Node(int value) { this.value = value; } }
    static List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Deque<Node> stack = new ArrayDeque<>(); stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop(); result.add(node.value);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        Node root = new Node(1); root.left = new Node(2); root.right = new Node(3);
        System.out.println(postorder(root));
    }
}