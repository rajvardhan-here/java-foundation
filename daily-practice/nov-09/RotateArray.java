import java.util.Arrays;

/** Rotates an array to the right by k positions in O(n) time and O(1) space. */
public class RotateArray {
    public static void rotate(int[] values, int k) {
        if (values == null || values.length < 2) return;

        int steps = Math.floorMod(k, values.length);
        if (steps == 0) return;

        reverse(values, 0, values.length - 1);
        reverse(values, 0, steps - 1);
        reverse(values, steps, values.length - 1);
    }

    private static void reverse(int[] values, int left, int right) {
        while (left < right) {
            int temp = values[left];
            values[left++] = values[right];
            values[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        rotate(values, 3);
        System.out.println(Arrays.toString(values)); // [5, 6, 7, 1, 2, 3, 4]
    }
}
