import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

/** FIFO queue with amortized O(1) enqueue and dequeue operations. */
public class QueueUsingStacks {
    private final Deque<Integer> incoming = new ArrayDeque<>();
    private final Deque<Integer> outgoing = new ArrayDeque<>();

    public void enqueue(int value) {
        incoming.push(value);
    }

    public int dequeue() {
        moveIfNeeded();
        if (outgoing.isEmpty()) throw new NoSuchElementException("Queue is empty");
        return outgoing.pop();
    }

    public int peek() {
        moveIfNeeded();
        if (outgoing.isEmpty()) throw new NoSuchElementException("Queue is empty");
        return outgoing.peek();
    }

    public boolean isEmpty() {
        return incoming.isEmpty() && outgoing.isEmpty();
    }

    private void moveIfNeeded() {
        if (outgoing.isEmpty()) {
            while (!incoming.isEmpty()) outgoing.push(incoming.pop());
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.peek());    // 10
        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.dequeue()); // 20
        System.out.println(queue.isEmpty()); // true
    }
}
