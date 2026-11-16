import java.util.Arrays;

public class Day10_BubbleSort {
    static void sort(int[] values) {
        for (int end = values.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i]; values[i] = values[i + 1]; values[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] values = {5, 1, 4, 2, 8};
        sort(values);
        System.out.println(Arrays.toString(values));
    }
}
