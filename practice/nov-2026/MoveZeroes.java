import java.util.Arrays;

public class MoveZeroes {
    public static void move(int[] nums) {
        int next = 0;
        for (int value : nums) if (value != 0) nums[next++] = value;
        while (next < nums.length) nums[next++] = 0;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
}
