/**
 * Small assertion-based checks for linked list operations.
 * Run with: java -ea -cp src/12_linked_list LinkedListExamples
 */
public class LinkedListExamples {
    public static void main(String[] args) {
        assert LinkedListTraversal.length(null) == 0;
        assert ReverseLinkedList.iterative(null) == null;
        assert MiddleNode.find(null) == null;
        assert !CycleDetection.hasCycle(null);

        LinkedListNode values = new LinkedListNode(1,
                new LinkedListNode(2, new LinkedListNode(3)));
        assert LinkedListTraversal.length(values) == 3;
        assert LinkedListTraversal.contains(values, 2);
        assert !LinkedListTraversal.contains(values, 9);
        assert MiddleNode.find(values).data == 2;

        LinkedListNode reversed = ReverseLinkedList.iterative(values);
        assert reversed.data == 3;
        assert reversed.next.data == 2;
        assert reversed.next.next.data == 1;

        LinkedListNode merged = MergeSortedLists.merge(
                new LinkedListNode(1, new LinkedListNode(4)),
                new LinkedListNode(2, new LinkedListNode(3)));
        assert LinkedListTraversal.length(merged) == 4;
        assert merged.data == 1 && merged.next.data == 2;
        System.out.println("All linked list checks passed.");
    }
}
