/**
 * Delete the first matching value or remove the head node.
 */
public class LinkedListDeletion {
    public static LinkedListNode deleteHead(LinkedListNode head) {
        return head == null ? null : head.next;
    }

    public static LinkedListNode deleteValue(LinkedListNode head, int value) {
        if (head == null) return null;
        if (head.data == value) return head.next;

        LinkedListNode current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next != null) current.next = current.next.next;
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1,
                new LinkedListNode(2, new LinkedListNode(2, new LinkedListNode(3))));
        head = deleteValue(head, 2);
        LinkedListTraversal.print(head); // 1 -> 2 -> 3
        head = deleteHead(head);
        LinkedListTraversal.print(head); // 2 -> 3
    }
}
