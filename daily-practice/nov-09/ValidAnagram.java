/** Checks whether two strings contain the same UTF-16 characters. */
public class ValidAnagram {
    public static boolean isAnagram(String first, String second) {
        if (first == null || second == null) return first == second;
        if (first.length() != second.length()) return false;

        int[] counts = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i < first.length(); i++) {
            counts[first.charAt(i)]++;
            counts[second.charAt(i)]--;
        }
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
    }
}
