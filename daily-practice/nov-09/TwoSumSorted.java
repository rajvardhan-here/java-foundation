import java.util.Arrays;

/** Returns 1-based indices of two values adding to target, or [-1, -1]. */
public class TwoSumSorted {
    public static int[] find(int[] values, int target) {
        if (values == null) return new int[]{-1, -1};

        int left = 0, right = values.length - 1;
        while (left < right) {
            long sum = (long) values[left] + values[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(new int[]{2, 7, 11, 15}, 9)));
        // [1, 2]
    }
}
