/** Reverses a singly linked list iteratively in O(n) time and O(1) space. */
public class ReverseLinkedList {
    static class Node { int value; Node next; Node(int value) { this.value = value; } }
    static Node reverse(Node head) {
        Node previous = null, current = head;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    static void print(Node head) {
        while (head != null) { System.out.print(head.value + " "); head = head.next; }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1); head.next = new Node(2); head.next.next = new Node(3);
        print(reverse(head));
    }
}