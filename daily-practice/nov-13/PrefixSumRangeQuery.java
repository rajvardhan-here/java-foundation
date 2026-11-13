/** Answers inclusive range-sum queries in O(1) after O(n) preprocessing. */
public class PrefixSumRangeQuery {
    private final long[] prefix;
    PrefixSumRangeQuery(int[] values) {
        prefix = new long[values.length + 1];
        for (int i = 0; i < values.length; i++) prefix[i + 1] = prefix[i] + values[i];
    }
    long sum(int left, int right) {
        if (left < 0 || right < left || right + 1 >= prefix.length)
            throw new IndexOutOfBoundsException("Invalid range");
        return prefix[right + 1] - prefix[left];
    }
    public static void main(String[] args) {
        System.out.println(new PrefixSumRangeQuery(new int[]{2, 4, 6, 8}).sum(1, 3));
    }
}