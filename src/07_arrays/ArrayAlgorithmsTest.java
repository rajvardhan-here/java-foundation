import java.util.Arrays;

public class ArrayAlgorithmsTest {

    public static void main(String[] args) {
        int[] values = {2, -1, 3, 4, -5};
        int[] prefix = ArrayAlgorithms.prefixSums(values);

        assert Arrays.equals(prefix, new int[]{2, 1, 4, 8, 3});
        assert ArrayAlgorithms.rangeSum(prefix, 1, 3) == 6;
        assert ArrayAlgorithms.rangeSum(prefix, 0, 2) == 4;

        assert ArrayAlgorithms.maxSubarraySum(values) == 8;
        assert ArrayAlgorithms.maxSubarraySum(new int[]{-8, -3, -6}) == -3;
        assert ArrayAlgorithms.maxSubarraySum(new int[]{5}) == 5;
        assert ArrayAlgorithms.maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}) == 6;

        assert ArrayAlgorithms.prefixSums(new int[0]).length == 0;

        System.out.println("All array algorithm checks passed.");
    }
}
