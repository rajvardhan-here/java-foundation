/**
 * Floyd's tortoise-and-hare cycle detection algorithm.
 */
public class CycleDetection {
    public static boolean hasCycle(LinkedListNode head) {
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(1);
        LinkedListNode second = new LinkedListNode(2);
        LinkedListNode third = new LinkedListNode(3);
        first.next = second;
        second.next = third;
        third.next = second; // Create a cycle for demonstration.

        System.out.println("Has cycle: " + hasCycle(first));
    }
}
