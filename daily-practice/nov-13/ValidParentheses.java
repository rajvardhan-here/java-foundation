import java.util.ArrayDeque;
import java.util.Deque;
/** Checks whether brackets are correctly nested and matched. */
public class ValidParentheses {
    static boolean isValid(String text) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : text.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((c == ')' && open != '(') || (c == ']' && open != '[')
                        || (c == '}' && open != '{')) return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }
}