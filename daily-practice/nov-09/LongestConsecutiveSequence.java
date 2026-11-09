import java.util.HashSet;
import java.util.Set;

/** Finds the longest run of consecutive integers in expected O(n) time. */
public class LongestConsecutiveSequence {
    public static int length(int[] values) {
        if (values == null || values.length == 0) return 0;

        Set<Integer> numbers = new HashSet<>();
        for (int value : values) numbers.add(value);

        int longest = 0;
        for (int value : numbers) {
            if (value == Integer.MIN_VALUE || !numbers.contains(value - 1)) {
                int current = value;
                int run = 1;
                while (current != Integer.MAX_VALUE && numbers.contains(current + 1)) {
                    current++;
                    run++;
                }
                longest = Math.max(longest, run);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(length(new int[]{100, 4, 200, 1, 3, 2})); // 4
    }
}
