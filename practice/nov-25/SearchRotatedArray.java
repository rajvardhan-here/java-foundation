/** Binary search in a rotated, strictly increasing array. */
public class SearchRotatedArray {
    public static int search(int[] nums, int target) {
        if (nums == null) throw new IllegalArgumentException("nums must not be null");
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] values = {4, 5, 6, 7, 0, 1, 2};
        if (search(values, 0) != 4 || search(values, 3) != -1) {
            throw new AssertionError("Rotated search checks failed");
        }
        System.out.println("SearchRotatedArray checks passed");
    }
}