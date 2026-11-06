/**
 * Reverse a singly linked list in-place or recursively.
 */
public class ReverseLinkedList {
    public static LinkedListNode iterative(LinkedListNode head) {
        LinkedListNode previous = null;
        LinkedListNode current = head;
        while (current != null) {
            LinkedListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static LinkedListNode recursive(LinkedListNode head) {
        if (head == null || head.next == null) return head;
        LinkedListNode newHead = recursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1,
                new LinkedListNode(2, new LinkedListNode(3)));
        LinkedListTraversal.print(iterative(head)); // 3 -> 2 -> 1
    }
}
