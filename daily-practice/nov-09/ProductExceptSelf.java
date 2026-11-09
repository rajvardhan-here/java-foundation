import java.util.Arrays;

/** Builds each position's product using prefix and suffix products. */
public class ProductExceptSelf {
    public static long[] calculate(int[] values) {
        if (values == null) throw new IllegalArgumentException("Array cannot be null");

        long[] result = new long[values.length];
        long prefix = 1;
        for (int i = 0; i < values.length; i++) {
            result[i] = prefix;
            prefix *= values[i];
        }

        long suffix = 1;
        for (int i = values.length - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= values[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculate(new int[]{1, 2, 3, 4})));
        // [24, 12, 8, 6]
    }
}
