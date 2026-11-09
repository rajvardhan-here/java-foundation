/** Finds the missing value from the range 0..n. */
public class MissingNumber {
    public static int find(int[] values) {
        if (values == null) throw new IllegalArgumentException("Array cannot be null");

        int result = values.length;
        for (int i = 0; i < values.length; i++) {
            result ^= i;
            result ^= values[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{3, 0, 1})); // 2
        System.out.println(find(new int[]{0, 1}));   // 2
    }
}
