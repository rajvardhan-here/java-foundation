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

    /**
     * Returns the first index of target, or -1 when it is absent.
     */
    public static int findFirst(int[] array, int target) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
