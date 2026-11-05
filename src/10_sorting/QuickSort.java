import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] values) {
        if (values == null || values.length < 2) {
            return;
        }
        quickSort(values, 0, values.length - 1);
    }

    private static void quickSort(int[] values, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(values, low, high);
        quickSort(values, low, pivotIndex - 1);
        quickSort(values, pivotIndex + 1, high);
    }

    private static int partition(int[] values, int low, int high) {
        int pivot = values[high];
        int smallerIndex = low;

        for (int current = low; current < high; current++) {
            if (values[current] <= pivot) {
                swap(values, current, smallerIndex);
                smallerIndex++;
            }
        }

        swap(values, smallerIndex, high);
        return smallerIndex;
    }

    private static void swap(int[] values, int first, int second) {
        int temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }

    public static void main(String[] args) {
        int[] values = {10, 7, 8, 9, 1, 5};
        sort(values);
        System.out.println(Arrays.toString(values));
    }
}
