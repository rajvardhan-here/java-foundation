import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] values) {
        if (values == null || values.length < 2) {
            return;
        }
        sort(values, new int[values.length], 0, values.length - 1);
    }

    private static void sort(int[] values, int[] temporary, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;
        sort(values, temporary, left, middle);
        sort(values, temporary, middle + 1, right);
        merge(values, temporary, left, middle, right);
    }

    private static void merge(int[] values, int[] temporary,
                              int left, int middle, int right) {
        int first = left;
        int second = middle + 1;
        int index = left;

        while (first <= middle && second <= right) {
            if (values[first] <= values[second]) {
                temporary[index++] = values[first++];
            } else {
                temporary[index++] = values[second++];
            }
        }

        while (first <= middle) {
            temporary[index++] = values[first++];
        }
        while (second <= right) {
            temporary[index++] = values[second++];
        }

        for (int i = left; i <= right; i++) {
            values[i] = temporary[i];
        }
    }

    public static void main(String[] args) {
        int[] values = {38, 27, 43, 3, 9, 82, 10};
        sort(values);
        System.out.println(Arrays.toString(values));
    }
}
