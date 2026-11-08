import java.util.Arrays;

/** Moves all zeroes to the end while preserving non-zero order. */
public class MoveZeroes {
    public static void move(int[] nums) {
        int write = 0;
        for (int value : nums) {
            if (value != 0) nums[write++] = value;
        }
        while (write < nums.length) nums[write++] = 0;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
}