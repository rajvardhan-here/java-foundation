/**
 * Basic singly linked list with append, prepend, size, and display operations.
 */
public class SinglyLinkedList {
    private LinkedListNode head;
    private int size;

    public void addFirst(int value) {
        head = new LinkedListNode(value, head);
        size++;
    }

    public void addLast(int value) {
        LinkedListNode node = new LinkedListNode(value);
        if (head == null) {
            head = node;
        } else {
            LinkedListNode current = head;
            while (current.next != null) current = current.next;
            current.next = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + (current.next == null ? "" : " -> "));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
        list.display(); // 10 -> 20 -> 30
        System.out.println("Size: " + list.size());
    }
}
