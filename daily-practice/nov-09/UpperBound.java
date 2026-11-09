/** Returns the first index whose value is strictly greater than target. */
public class UpperBound {
    public static int find(int[] values, int target) {
        if (values == null) return -1;

        int left = 0;
        int right = values.length;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (values[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 2, 2, 4, 6};
        System.out.println(find(values, 2)); // 4
        System.out.println(find(values, 6)); // 6
    }
}
