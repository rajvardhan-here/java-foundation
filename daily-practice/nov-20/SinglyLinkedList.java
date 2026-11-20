public class SinglyLinkedList {
    static class Node {
        int value; Node next;
        Node(int value) { this.value = value; }
    }
    private Node head;
    void addLast(int value) {
        Node node = new Node(value);
        if (head == null) { head = node; return; }
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = node;
    }
    void print() {
        for (Node n = head; n != null; n = n.next)
            System.out.print(n.value + (n.next == null ? "" : " -> "));
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(10); list.addLast(20); list.addLast(30);
        list.print();
    }
}