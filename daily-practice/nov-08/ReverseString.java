/** Reverses a character array in place using two pointers. */
import java.util.Arrays;

public class ReverseString {
    public static void reverse(char[] chars) {
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
    }

    public static void main(String[] args) {
        char[] word = "java".toCharArray();
        reverse(word);
        System.out.println(Arrays.toString(word));
    }
}