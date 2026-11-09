import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/** Finds the first greater value to the right of each array position. */
public class NextGreaterElement {
    public static int[] find(int[] values) {
        if (values == null) return new int[0];

        int[] result = new int[values.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = values.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= values[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(values[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(new int[]{4, 5, 2, 25})));
        // [5, 25, 25, -1]
    }
}
