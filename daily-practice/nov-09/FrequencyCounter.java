import java.util.LinkedHashMap;
import java.util.Map;

/** Counts values while preserving their first-seen order. */
public class FrequencyCounter {
    public static Map<Integer, Integer> count(int[] values) {
        Map<Integer, Integer> frequencies = new LinkedHashMap<>();
        if (values == null) return frequencies;

        for (int value : values) {
            frequencies.put(value, frequencies.getOrDefault(value, 0) + 1);
        }
        return frequencies;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{4, 2, 4, 3, 2, 4}));
        // {4=3, 2=2, 3=1}
    }
}
