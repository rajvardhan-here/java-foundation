import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** Merges overlapping closed intervals. Input is not modified. */
public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals == null) throw new IllegalArgumentException("intervals must not be null");
        int[][] sorted = new int[intervals.length][2];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i] == null || intervals[i].length != 2
                    || intervals[i][0] > intervals[i][1]) {
                throw new IllegalArgumentException("Each interval must be [start, end]");
            }
            sorted[i] = intervals[i].clone();
        }
        Arrays.sort(sorted, Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : sorted) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval.clone());
            } else {
                merged.get(merged.size() - 1)[1] =
                        Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] result = merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        if (!Arrays.deepEquals(result, new int[][]{{1, 6}, {8, 10}, {15, 18}})) {
            throw new AssertionError(Arrays.deepToString(result));
        }
        System.out.println("MergeIntervals checks passed");
    }
}