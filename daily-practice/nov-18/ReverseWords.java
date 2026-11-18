public class ReverseWords {
    static String reverseWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (result.length() > 0) result.append(' ');
            result.append(words[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Java makes learning fun"));
    }
}
