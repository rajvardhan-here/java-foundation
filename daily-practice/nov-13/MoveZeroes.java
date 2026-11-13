import java.util.Arrays;
/** Preserves non-zero order while moving all zeroes to the end. */
public class MoveZeroes {
    static void move(int[] a) {
        int write = 0;
        for (int value : a) if (value != 0) a[write++] = value;
        while (write < a.length) a[write++] = 0;
    }
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12}; move(a);
        System.out.println(Arrays.toString(a));
    }
}