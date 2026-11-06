/**
 * Find the middle node in one traversal.
 * For an even-length list, this returns the second middle node.
 */
public class MiddleNode {
    public static LinkedListNode find(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1,
                new LinkedListNode(2, new LinkedListNode(3,
                new LinkedListNode(4, new LinkedListNode(5)))));
        LinkedListNode middle = find(head);
        System.out.println(middle == null ? "List is empty" : middle.data);
    }
}
