/**
 * Merge two ascending linked lists by reusing their existing nodes.
 */
public class MergeSortedLists {
    public static LinkedListNode merge(LinkedListNode first, LinkedListNode second) {
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode tail = dummy;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        tail.next = first != null ? first : second;
        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedListNode a = new LinkedListNode(1, new LinkedListNode(3, new LinkedListNode(5)));
        LinkedListNode b = new LinkedListNode(2, new LinkedListNode(4, new LinkedListNode(6)));
        LinkedListTraversal.print(merge(a, b)); // 1 -> 2 -> 3 -> 4 -> 5 -> 6
    }
}
