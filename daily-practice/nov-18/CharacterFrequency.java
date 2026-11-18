import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    static Map<Character, Integer> countCharacters(String text) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char character : text.toCharArray()) {
            counts.put(character, counts.getOrDefault(character, 0) + 1);
        }
        return counts;
    }

    public static void main(String[] args) {
        System.out.println(countCharacters("programming"));
    }
}
