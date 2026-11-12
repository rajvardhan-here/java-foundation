import java.util.Arrays;

/**
 * Builds an output array where each position contains the product
 * of every input value except the value at that position.
 * Runs in O(n) time without using division.
 */
public class ProductExceptSelf {
    public static int[] calculate(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculate(new int[]{1, 2, 3, 4})));
    }
}
