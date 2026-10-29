/**
 * Iterative binary search for a sorted integer array.
 * Returns the index of target, or -1 if target is not present.
 */
public class BinarySearch {
    public static int binarySearch(int[] numbers, int target) {
        if (numbers == null) {
            throw new IllegalArgumentException("numbers must not be null");
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;
        int index = binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found");
        }
    }
}
