/** Reverses word order and normalizes whitespace between words. */
public class ReverseWords {
    public static String reverse(String value) {
        if (value == null || value.trim().isEmpty()) return "";

        String[] words = value.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (result.length() > 0) result.append(' ');
            result.append(words[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("  Java   is fun  ")); // fun is Java
    }
}
