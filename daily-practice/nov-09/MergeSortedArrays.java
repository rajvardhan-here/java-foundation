import java.util.Arrays;

/** Merges two ascending arrays without sorting the combined result. */
public class MergeSortedArrays {
    public static int[] merge(int[] first, int[] second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Input arrays cannot be null");
        }

        int[] merged = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            merged[k++] = first[i] <= second[j] ? first[i++] : second[j++];
        }
        while (i < first.length) merged[k++] = first[i++];
        while (j < second.length) merged[k++] = second[j++];
        return merged;
    }

    public static void main(String[] args) {
        int[] result = merge(new int[]{1, 4, 7}, new int[]{2, 3, 8, 9});
        System.out.println(Arrays.toString(result));
    }
}
