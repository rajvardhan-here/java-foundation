public class Day07_CharacterFrequency {
    static int frequency(String text, char target) {
        int count = 0;
        for (char ch : text.toCharArray()) if (ch == target) count++;
        return count;
    }
    public static void main(String[] args) {
        System.out.println(frequency("programming", 'm'));
    }
}
