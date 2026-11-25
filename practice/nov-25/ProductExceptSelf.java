import java.util.Arrays;

/** Returns products of all elements except the element at each index, without division. */
public class ProductExceptSelf {
    public static int[] calculate(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("nums must not be null");
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
        int[] actual = calculate(new int[]{1, 2, 3, 4});
        if (!Arrays.equals(actual, new int[]{24, 12, 8, 6})) {
            throw new AssertionError(Arrays.toString(actual));
        }
        System.out.println("ProductExceptSelf checks passed");
    }
}