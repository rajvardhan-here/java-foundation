import java.util.Arrays;
/** Rotates an array right in-place using three reversals. */
public class RotateArrayRight {
    static void rotate(int[] a, int k) {
        if (a.length == 0) return;
        k = ((k % a.length) + a.length) % a.length;
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
    }
    private static void reverse(int[] a, int l, int r) {
        while (l < r) { int t = a[l]; a[l++] = a[r]; a[r--] = t; }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}; rotate(a, 2);
        System.out.println(Arrays.toString(a));
    }
}