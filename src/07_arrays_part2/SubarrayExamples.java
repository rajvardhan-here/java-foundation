/** Runnable examples for brute-force, prefix-sum, and Kadane approaches. */
public class SubarrayExamples {
    public static void main(String[] args) {
        int[] mixed = {-2, 3, -1, 5, -6, 4};
        int[] allNegative = {-8, -3, -6, -2, -5, -4};
        int[] prefix = PrefixSum.build(mixed);

        System.out.println("Brute-force maximum: " + bruteforce.maxSubArray(mixed));
        System.out.println("Kadane maximum: " + KadaneAlgorithm.maxSubarraySum(mixed));
        System.out.println("All-negative maximum: " + KadaneAlgorithm.maxSubarraySum(allNegative));
        System.out.println("Range sum [1, 3]: " + PrefixSum.rangeSum(prefix, 1, 3));
    }
}
