/** Binary search on a sorted array using recursion. */
public class RecursiveBinarySearch {
    public static int search(int[] values, int target) {
        if (values == null) return -1;
        return search(values, target, 0, values.length - 1);
    }

    private static int search(int[] values, int target, int left, int right) {
        if (left > right) return -1;

        int middle = left + (right - left) / 2;
        if (values[middle] == target) return middle;
        if (values[middle] > target) {
            return search(values, target, left, middle - 1);
        }
        return search(values, target, middle + 1, right);
    }

    public static void main(String[] args) {
        int[] values = {2, 5, 8, 12, 16, 23, 38};
        System.out.println(search(values, 16)); // 4
        System.out.println(search(values, 7));  // -1
    }
}
