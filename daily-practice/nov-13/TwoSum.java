import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
/** Finds two distinct indices whose values add up to target. */
public class TwoSum {
    static int[] find(int[] a, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int need = target - a[i];
            if (seen.containsKey(need)) return new int[]{seen.get(need), i};
            seen.put(a[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(new int[]{2, 7, 11, 15}, 9)));
    }
}