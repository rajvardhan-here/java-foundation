/**
 * Common read-only operations for singly linked lists.
 */
public class LinkedListTraversal {
    public static void print(LinkedListNode head) {
        for (LinkedListNode current = head; current != null; current = current.next) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static int length(LinkedListNode head) {
        int count = 0;
        for (LinkedListNode current = head; current != null; current = current.next) {
            count++;
        }
        return count;
    }

    public static boolean contains(LinkedListNode head, int target) {
        for (LinkedListNode current = head; current != null; current = current.next) {
            if (current.data == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(4,
                new LinkedListNode(8, new LinkedListNode(12)));
        print(head);
        System.out.println("Length: " + length(head));
        System.out.println("Contains 8: " + contains(head, 8));
    }
}
