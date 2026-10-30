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

    /** Returns every matching index in ascending order. */
    public static int[] findAllIndices(int[] array, int target) {
        requireArray(array);
        int count = countOccurrences(array, target);
        int[] indices = new int[count];
        int next = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) indices[next++] = i;
        }
        return indices;
    }

    /** Searches only within [startInclusive, endExclusive). */
    public static int findInRange(int[] array, int target,
                                  int startInclusive, int endExclusive) {
        requireArray(array);
        if (startInclusive < 0 || endExclusive > array.length
                || startInclusive > endExclusive) {
            throw new IndexOutOfBoundsException("Invalid search range");
        }
        for (int i = startInclusive; i < endExclusive; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    /** Returns true when target is present. */
    public static boolean contains(int[] array, int target) {
        return findFirst(array, target) != -1;
    }

    private static void requireArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
    }

}
