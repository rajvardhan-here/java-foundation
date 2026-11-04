import java.util.Arrays;
public class ReverseInPlace {
    public static void reverse(int[] values) {
        int left = 0, right = values.length - 1;
        while (left < right) {
            int temp = values[left]; values[left++] = values[right]; values[right--] = temp;
        }
    }
    public static void main(String[] args) {
        int[] values = {3, 6, 9, 12}; reverse(values);
        System.out.println(Arrays.toString(values));
    }
}