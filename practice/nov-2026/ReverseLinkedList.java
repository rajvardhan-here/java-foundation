public class ReverseLinkedList {
    static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }
    public static Node reverse(Node head) {
        Node previous = null;
        while (head != null) {
            Node next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }
    public static void main(String[] args) {
        Node first = new Node(1);
        first.next = new Node(2);
        first.next.next = new Node(3);
        for (Node node = reverse(first); node != null; node = node.next) System.out.print(node.value + " ");
    }
}
