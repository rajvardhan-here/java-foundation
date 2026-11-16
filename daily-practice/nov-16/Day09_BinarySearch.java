public class Day09_BinarySearch {
    static int search(int[] sorted, int target) {
        int low = 0, high = sorted.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sorted[mid] == target) return mid;
            if (sorted[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 3, 5, 7, 9}, 7));
    }
}
