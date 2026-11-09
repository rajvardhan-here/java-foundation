import java.util.LinkedHashMap;
import java.util.Map;

/** Returns the index of the first character appearing exactly once. */
public class FirstUniqueCharacter {
    public static int findIndex(String value) {
        if (value == null || value.isEmpty()) return -1;

        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);
            counts.put(character, counts.getOrDefault(character, 0) + 1);
        }

        for (int i = 0; i < value.length(); i++) {
            if (counts.get(value.charAt(i)) == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findIndex("leetcode")); // 0
        System.out.println(findIndex("aabb"));     // -1
    }
}
