public class Day19_MaxSubarray {
    static int maxSubarraySum(int[] values) {
        if (values.length == 0) throw new IllegalArgumentException("Array cannot be empty");
        int best = values[0], current = values[0];
        for (int i = 1; i < values.length; i++) {
            current = Math.max(values[i], current + values[i]);
            best = Math.max(best, current);
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
