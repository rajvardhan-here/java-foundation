/** Iterative binary search on an ascending sorted array. */
public class BinarySearch {
    static int search(int[] values, int target) {
        int left = 0, right = values.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (values[mid] == target) return mid;
            if (values[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 3, 5, 7, 9}, 7));
    }
}