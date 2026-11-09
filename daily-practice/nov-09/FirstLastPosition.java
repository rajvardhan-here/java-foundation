import java.util.Arrays;

/** Finds the inclusive range of a target in a sorted array. */
public class FirstLastPosition {
    public static int[] findRange(int[] values, int target) {
        if (values == null) return new int[]{-1, -1};

        int first = lowerBound(values, target);
        if (first == values.length || values[first] != target) {
            return new int[]{-1, -1};
        }

        int afterLast = upperBound(values, target);
        return new int[]{first, afterLast - 1};
    }

    private static int lowerBound(int[] values, int target) {
        int left = 0, right = values.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (values[middle] < target) left = middle + 1;
            else right = middle;
        }
        return left;
    }

    private static int upperBound(int[] values, int target) {
        int left = 0, right = values.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (values[middle] <= target) left = middle + 1;
            else right = middle;
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRange(
            new int[]{1, 2, 2, 2, 3, 4}, 2))); // [1, 3]
    }
}
