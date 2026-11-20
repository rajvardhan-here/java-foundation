import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class TwoSum {
    static int[] findPair(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (seen.containsKey(needed)) return new int[]{seen.get(needed), i};
            seen.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findPair(new int[]{2, 7, 11, 15}, 9)));
    }
}