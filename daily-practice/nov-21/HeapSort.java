import java.util.Arrays;

public class HeapSort {
    static void sort(int[] values) {
        int n = values.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(values, n, i);
        for (int end = n - 1; end > 0; end--) {
            int temp = values[0]; values[0] = values[end]; values[end] = temp;
            heapify(values, end, 0);
        }
    }
    private static void heapify(int[] a, int size, int root) {
        int largest = root, left = 2 * root + 1, right = left + 1;
        if (left < size && a[left] > a[largest]) largest = left;
        if (right < size && a[right] > a[largest]) largest = right;
        if (largest != root) {
            int temp = a[root]; a[root] = a[largest]; a[largest] = temp;
            heapify(a, size, largest);
        }
    }
    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6, 7}; sort(data);
        System.out.println(Arrays.toString(data));
    }
}