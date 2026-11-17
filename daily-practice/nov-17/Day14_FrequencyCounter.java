import java.util.HashMap;
import java.util.Map;
public class Day14_FrequencyCounter {
    public static Map<Integer, Integer> frequencies(int[] values) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int value : values) counts.put(value, counts.getOrDefault(value, 0) + 1);
        return counts;
    }
    public static void main(String[] args) {
        System.out.println(frequencies(new int[]{1, 2, 2, 3, 1, 1}));
    }
}