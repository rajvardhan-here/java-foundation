/** Searches a rotated sorted array containing distinct values. */
public class SearchInRotatedArray {
    public static int search(int[] values, int target) {
        if (values == null) return -1;

        int left = 0;
        int right = values.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (values[middle] == target) return middle;

            if (values[left] <= values[middle]) {
                if (values[left] <= target && target < values[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (values[middle] < target && target <= values[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] values = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(values, 0)); // 4
        System.out.println(search(values, 3)); // -1
    }
}
