public class QueueArray {
    private final int[] data = new int[5];
    private int front = 0, rear = 0, size = 0;
    void offer(int value) {
        if (size == data.length) throw new IllegalStateException("Queue full");
        data[rear] = value;
        rear = (rear + 1) % data.length;
        size++;
    }
    int poll() {
        if (size == 0) throw new IllegalStateException("Queue empty");
        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }
    public static void main(String[] args) {
        QueueArray queue = new QueueArray();
        queue.offer(10); queue.offer(20);
        System.out.println(queue.poll());
    }
}