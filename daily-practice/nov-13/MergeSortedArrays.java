import java.util.Arrays;
/** Merges two ascending arrays into a new ascending array. */
public class MergeSortedArrays {
    static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
            result[k++] = a[i] <= b[j] ? a[i++] : b[j++];
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 4, 7}, new int[]{2, 3, 8})));
    }
}