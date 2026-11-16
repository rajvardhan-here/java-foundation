import java.util.HashMap;
import java.util.Map;

public class Day11_TwoSum {
    static int[] twoSum(int[] values, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            int needed = target - values[i];
            if (seen.containsKey(needed)) return new int[]{seen.get(needed), i};
            seen.put(values[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] answer = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(answer[0] + ", " + answer[1]);
    }
}
