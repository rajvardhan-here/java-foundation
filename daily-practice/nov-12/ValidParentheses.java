import java.util.ArrayDeque;
import java.util.Deque;

/** Checks whether brackets are correctly opened and closed. */
public class ValidParentheses {
    public static boolean isValid(String text) {
        if (text == null) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : text.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char opening = stack.pop();
                if ((ch == ')' && opening != '(')
                        || (ch == ']' && opening != '[')
                        || (ch == '}' && opening != '{')) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
        System.out.println(isValid("{[(])}"));
    }
}
