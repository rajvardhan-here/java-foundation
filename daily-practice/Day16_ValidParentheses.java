import java.util.ArrayDeque;
import java.util.Deque;
public class Day16_ValidParentheses {
    static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') stack.push(ch);
            else {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((ch == ')' && open != '(') || (ch == ']' && open != '[')
                        || (ch == '}' && open != '{')) return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }
}