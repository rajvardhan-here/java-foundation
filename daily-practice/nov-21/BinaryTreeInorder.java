import java.util.*;

public class BinaryTreeInorder {
    static class Node { int value; Node left, right; Node(int value) { this.value = value; } }
    static List<Integer> inorder(Node root) {
        List<Integer> result = new ArrayList<>();
        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) { stack.push(current); current = current.left; }
            current = stack.pop(); result.add(current.value); current = current.right;
        }
        return result;
    }
    public static void main(String[] args) {
        Node root = new Node(2); root.left = new Node(1); root.right = new Node(3);
        System.out.println(inorder(root));
    }
}