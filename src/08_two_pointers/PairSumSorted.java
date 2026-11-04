import java.util.Arrays;
public class PairSumSorted {
    public static int[] findPair(int[] values, int target) {
        int left = 0, right = values.length - 1;
        while (left < right) {
            long sum = (long) values[left] + values[right];
            if (sum == target) return new int[]{left, right};
            if (sum < target) left++; else right--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPair(new int[]{1, 2, 4, 6, 9}, 10)));
    }
}