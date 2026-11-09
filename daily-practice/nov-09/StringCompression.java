/** Compresses consecutive repeated characters using run-length encoding. */
public class StringCompression {
    public static String compress(String value) {
        if (value == null || value.isEmpty()) return value;

        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= value.length(); i++) {
            if (i < value.length() && value.charAt(i) == value.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(value.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return compressed.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabbccccd")); // a3b2c4d1
        System.out.println(compress("abcd"));       // a1b1c1d1
    }
}
