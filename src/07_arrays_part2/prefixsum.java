/**
 * Prefix-sum basics for integer arrays.
 * Preprocessing takes O(n) time; each range query takes O(1) time.
 */
public class prefixsum {
    /** Builds an array where prefix[i] is the sum of the first i values. */
    public static int[] buildPrefixSum(int[] numbers) {
        if (numbers == null) throw new IllegalArgumentException("Input array must not be null");
        int[] prefix = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) prefix[i + 1] = prefix[i] + numbers[i];
        return prefix;
    }

    /** Returns the sum from left through right, both indices inclusive. */
    public static int rangeSum(int[] prefix, int left, int right) {
        if (prefix == null) throw new IllegalArgumentException("Prefix array must not be null");
        if (left < 0 || right < left || right >= prefix.length - 1) {
            throw new IndexOutOfBoundsException("Invalid inclusive range");
        }
        return prefix[right + 1] - prefix[left];
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int[] prefix = buildPrefixSum(numbers);
        System.out.println("Sum from index 1 to 3: " + rangeSum(prefix, 1, 3));
    }
}
