import java.util.HashSet;
import java.util.Set;

/**
 * Finds the length of the longest consecutive-value sequence.
 * Each value is processed a constant number of times on average.
 */
public class LongestConsecutiveSequence {
    public static int longest(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int value : nums) {
            values.add(value);
        }

        int best = 0;
        for (int value : values) {
            if (!values.contains(value - 1)) {
                int current = value;
                int length = 1;

                while (values.contains(current + 1)) {
                    current++;
                    length++;
                }
                best = Math.max(best, length);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(longest(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
