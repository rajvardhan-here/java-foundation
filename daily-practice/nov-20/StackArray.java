public class StackArray {
    private final int[] data = new int[5];
    private int top = -1;
    void push(int value) {
        if (top == data.length - 1) throw new IllegalStateException("Stack full");
        data[++top] = value;
    }
    int pop() {
        if (top == -1) throw new IllegalStateException("Stack empty");
        return data[top--];
    }
    public static void main(String[] args) {
        StackArray stack = new StackArray();
        stack.push(10); stack.push(20);
        System.out.println(stack.pop());
    }
}