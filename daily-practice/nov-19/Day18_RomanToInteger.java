import java.util.Map;
public class Day18_RomanToInteger {
    private static final Map<Character, Integer> VALUES = Map.of(
        'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
    public static int convert(String roman) {
        int total = 0, previous = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = VALUES.getOrDefault(roman.charAt(i), 0);
            if (value == 0) throw new IllegalArgumentException("Invalid Roman numeral");
            total += value < previous ? -value : value;
            previous = value;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(convert("MCMXCIV")); // 1994
    }
}