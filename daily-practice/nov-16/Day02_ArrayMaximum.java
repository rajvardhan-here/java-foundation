public class Day02_ArrayMaximum {
    static int maximum(int[] values) {
        if (values.length == 0) throw new IllegalArgumentException("Array cannot be empty");
        int max = values[0];
        for (int value : values) if (value > max) max = value;
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximum(new int[]{-3, 7, 2, 11, 4}));
    }
}
