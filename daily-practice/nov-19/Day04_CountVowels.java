public class Day04_CountVowels {
    public static int count(String text) {
        int total = 0;
        for (char ch : text.toLowerCase().toCharArray())
            if ("aeiou".indexOf(ch) >= 0) total++;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(count("Java Programming")); // 5
    }
}