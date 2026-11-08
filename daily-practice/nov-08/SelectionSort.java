import java.util.Arrays;

/** Selection sort implementation with O(n^2) time and O(1) extra space. */
public class SelectionSort {
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) minIndex = j;
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 64, 25, 12, 22, 11 };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}