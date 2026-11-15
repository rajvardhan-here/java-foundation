import java.util.Arrays;
public class Day09_BubbleSort {
    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < a.length - 1 - i; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t; swapped = true;
                }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8}; sort(a);
        System.out.println(Arrays.toString(a));
    }
}