import java.util.*;

/** Stack supporting push, pop, top, and getMin in O(1) time. */
public class MinStack {
    private final Deque<Integer> values = new ArrayDeque<>();
    private final Deque<Integer> minimums = new ArrayDeque<>();

    public void push(int value) {
        values.push(value);
        if (minimums.isEmpty() || value <= minimums.peek()) minimums.push(value);
    }
    public int pop() {
        if (values.isEmpty()) throw new NoSuchElementException("Stack is empty");
        int value = values.pop();
        if (value == minimums.peek()) minimums.pop();
        return value;
    }
    public int top() {
        if (values.isEmpty()) throw new NoSuchElementException("Stack is empty");
        return values.peek();
    }
    public int getMin() {
        if (minimums.isEmpty()) throw new NoSuchElementException("Stack is empty");
        return minimums.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(5); stack.push(2); stack.push(7);
        System.out.println(stack.getMin()); // 2
        stack.pop();
        System.out.println(stack.top()); // 2
    }
}