import java.util.Arrays;

public class Day18_SelectionSort {
    static void sort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[minIndex]) minIndex = j;
            }
            int temp = values[i]; values[i] = values[minIndex]; values[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] values = {64, 25, 12, 22, 11};
        sort(values);
        System.out.println(Arrays.toString(values));
    }
}
