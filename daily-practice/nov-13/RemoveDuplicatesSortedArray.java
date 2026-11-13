import java.util.Arrays;
/** Compacts a sorted array in-place and returns its unique-element length. */
public class RemoveDuplicatesSortedArray {
    static int compact(int[] a) {
        if (a.length == 0) return 0;
        int write = 1;
        for (int read = 1; read < a.length; read++)
            if (a[read] != a[write - 1]) a[write++] = a[read];
        return write;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3}; int n = compact(a);
        System.out.println(Arrays.toString(Arrays.copyOf(a, n)));
    }
}