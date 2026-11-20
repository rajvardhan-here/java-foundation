import java.util.Arrays;
public class InsertionSort {
    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] a = {9, 5, 1, 4, 3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}