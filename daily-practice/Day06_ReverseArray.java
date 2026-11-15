import java.util.Arrays;
public class Day06_ReverseArray {
    static void reverse(int[] values) {
        for (int left = 0, right = values.length - 1; left < right; left++, right--) {
            int temp = values[left]; values[left] = values[right]; values[right] = temp;
        }
    }
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        reverse(values);
        System.out.println(Arrays.toString(values));
    }
}