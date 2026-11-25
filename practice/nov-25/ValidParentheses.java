import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/** Checks whether brackets are correctly nested. Runs in O(n) time. */
public class ValidParentheses {
    private static final Map<Character, Character> PAIRS =
            Map.of(')', '(', ']', '[', '}', '{');

    public static boolean isValid(String value) {
        if (value == null) return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : value.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (PAIRS.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != PAIRS.get(ch)) return false;
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        if (!isValid("{[()]}") || isValid("([)]") || isValid("(")) {
            throw new AssertionError("Bracket validation failed");
        }
        System.out.println("ValidParentheses checks passed");
    }
}