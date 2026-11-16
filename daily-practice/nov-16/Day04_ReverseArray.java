import java.util.Arrays;

public class Day04_ReverseArray {
    static void reverse(int[] values) {
        int left = 0, right = values.length - 1;
        while (left < right) {
            int temp = values[left];
            values[left++] = values[right];
            values[right--] = temp;
        }
    }
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        reverse(values);
        System.out.println(Arrays.toString(values));
    }
}
