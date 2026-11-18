import java.util.Arrays;

public class AnagramChecker {
    static boolean areAnagrams(String first, String second) {
        char[] left = first.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] right = second.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(left);
        Arrays.sort(right);
        return Arrays.equals(left, right);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("Listen", "Silent"));
    }
}
