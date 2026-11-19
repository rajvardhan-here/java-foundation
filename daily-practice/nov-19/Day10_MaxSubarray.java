public class Day10_MaxSubarray {
    public static int maxSum(int[] values) {
        if (values == null || values.length == 0) throw new IllegalArgumentException("Array must not be empty");
        int current = values[0], best = values[0];
        for (int i = 1; i < values.length; i++) {
            current = Math.max(values[i], current + values[i]);
            best = Math.max(best, current);
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); // 6
    }
}