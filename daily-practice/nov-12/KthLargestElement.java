import java.util.Random;

/** Quickselect solution with average O(n) time complexity. */
public class KthLargestElement {
    private static final Random RANDOM = new Random();

    public static int find(int[] nums, int k) {
        if (nums == null || k < 1 || k > nums.length) {
            throw new IllegalArgumentException("k must be between 1 and array length");
        }

        int target = nums.length - k;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int pivotIndex = left + RANDOM.nextInt(right - left + 1);
            int finalPivot = partition(nums, left, right, pivotIndex);

            if (finalPivot == target) {
                return nums[finalPivot];
            } else if (finalPivot < target) {
                left = finalPivot + 1;
            } else {
                right = finalPivot - 1;
            }
        }
        throw new IllegalStateException("Selection failed");
    }

    private static int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, right);
        int store = left;

        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                swap(nums, store++, i);
            }
        }
        swap(nums, store, right);
        return store;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }
}
