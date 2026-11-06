/**
 * Insert values at the head, tail, or a zero-based position.
 */
public class LinkedListInsertion {
    public static LinkedListNode insertAtHead(LinkedListNode head, int value) {
        return new LinkedListNode(value, head);
    }

    public static LinkedListNode insertAtTail(LinkedListNode head, int value) {
        LinkedListNode node = new LinkedListNode(value);
        if (head == null) return node;

        LinkedListNode current = head;
        while (current.next != null) current = current.next;
        current.next = node;
        return head;
    }

    public static LinkedListNode insertAt(LinkedListNode head, int index, int value) {
        if (index < 0) throw new IndexOutOfBoundsException("Negative index: " + index);
        if (index == 0) return insertAtHead(head, value);

        LinkedListNode current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }
        if (current == null) throw new IndexOutOfBoundsException("Index: " + index);
        current.next = new LinkedListNode(value, current.next);
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode head = insertAtTail(null, 10);
        head = insertAt(head, 1, 30);
        head = insertAtHead(head, 5);
        LinkedListTraversal.print(head); // 5 -> 10 -> 30
    }
}
