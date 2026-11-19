public class Day05_RemoveWhitespace {
    public static String remove(String text) {
        return text.replaceAll("\\s+", "");
    }
    public static void main(String[] args) {
        System.out.println(remove("Java is fun")); // Javaisfun
    }
}