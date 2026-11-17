public class Day06_BinarySearchRecursive {
    public static int search(int[] values, int target, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (values[mid] == target) return mid;
        if (values[mid] > target) return search(values, target, low, mid - 1);
        return search(values, target, mid + 1, high);
    }
    public static void main(String[] args) {
        int[] values = {1, 3, 5, 7, 9, 11};
        System.out.println(search(values, 7, 0, values.length - 1));
    }
}