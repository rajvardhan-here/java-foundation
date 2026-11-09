/** Finds any peak: an element greater than its existing neighbours. */
public class FindPeakElement {
    public static int findPeak(int[] values) {
        if (values == null || values.length == 0) return -1;

        int left = 0;
        int right = values.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (values[middle] < values[middle + 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] values = {1, 3, 7, 6, 4, 2};
        int peak = findPeak(values);
        System.out.println("Peak index: " + peak);
        System.out.println("Peak value: " + values[peak]);
    }
}
