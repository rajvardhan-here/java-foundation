/** Lightweight regression checks; run with `java -ea SubarrayAlgorithmTests`. */
public class SubarrayAlgorithmTests {
    private static void assertEquals(String label, int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError(label + ": expected " + expected + ", got " + actual);
        }
    }

    public static void main(String[] args) {
        int[] mixed = {-2, 3, -1, 5, -6, 4};
        int[] allNegative = {-8, -3, -6, -2, -5, -4};
        int[] single = {9};
        int[] values = {2, 4, 6, 8, 10};
        int[] prefix = PrefixSum.build(values);

        assertEquals("Brute force mixed values", 7, bruteforce.maxSubArray(mixed));
        assertEquals("Kadane mixed values", 7, KadaneAlgorithm.maxSubarraySum(mixed));
        assertEquals("Kadane all-negative values", -2, KadaneAlgorithm.maxSubarraySum(allNegative));
        assertEquals("Single-element maximum", 9, KadaneAlgorithm.maxSubarraySum(single));
        assertEquals("Prefix range in middle", 18, PrefixSum.rangeSum(prefix, 1, 3));
        assertEquals("Prefix full range", 30, PrefixSum.rangeSum(prefix, 0, 4));
        assertEquals("Prefix first element", 2, PrefixSum.rangeSum(prefix, 0, 0));

        System.out.println("All subarray algorithm checks passed.");
    }
}
