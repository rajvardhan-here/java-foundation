import java.util.HashMap;
import java.util.Map;

/** Finds two indices whose values add up to the target in O(n) time. */
public class TwoSum {
    public static int[] find(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] result = find(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(result[0] + ", " + result[1]);
    }
}