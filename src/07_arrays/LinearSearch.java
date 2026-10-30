/**
 * Linear search utilities for arrays.
 *
 * Time complexity: O(n) for a single search.
 * Space complexity: O(1) for findFirst/findLast.
 */
public class LinearSearch {

    private LinearSearch() {
        // Utility class
    }

    /** Returns the first index of target, or -1 when absent. */
    public static int findFirst(int[] array, int target) {
        requireArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    /** Returns the last index of target, or -1 when absent. */
    public static int findLast(int[] array, int target) {
        requireArray(array);
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    /** Counts how many times target occurs. */
    public static int countOccurrences(int[] array, int target) {
        requireArray(array);
        int count = 0;
        for (int value : array) {
            if (value == target) count++;
        }
        return count;
    }

}
