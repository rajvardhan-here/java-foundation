import java.util.ArrayDeque;
import java.util.Deque;

/** Validates balanced round, square, and curly brackets in a string. */
public class ParenthesesValidator {
    public static boolean isBalanced(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((ch == ')' && open != '(') ||
                    (ch == ']' && open != '[') ||
                    (ch == '}' && open != '{')) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
    }
}