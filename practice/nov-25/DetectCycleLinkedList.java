/** Floyd's tortoise-and-hare cycle detection for a singly linked list. */
public class DetectCycleLinkedList {
    static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    public static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node first = new Node(1), second = new Node(2), third = new Node(3);
        first.next = second;
        second.next = third;
        if (hasCycle(first)) throw new AssertionError("Unexpected cycle");
        third.next = second;
        if (!hasCycle(first)) throw new AssertionError("Cycle was not detected");
        System.out.println("DetectCycleLinkedList checks passed");
    }
}