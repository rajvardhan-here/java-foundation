import java.util.LinkedHashMap;
import java.util.Map;
public class Day18_CharacterFrequency {
    static Map<Character, Integer> frequency(String s) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        return counts;
    }
    public static void main(String[] args) {
        System.out.println(frequency("programming"));
    }
}