/** Finds the value occurring once when every other value occurs twice. */
public class SingleNumberXor {
    public static int find(int[] values) {
        if (values == null) throw new IllegalArgumentException("Array cannot be null");

        int unique = 0;
        for (int value : values) unique ^= value;
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{4, 1, 2, 1, 2})); // 4
    }
}
