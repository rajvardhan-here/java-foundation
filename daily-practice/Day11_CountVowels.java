public class Day11_CountVowels {
    static int count(String text) {
        int total = 0;
        for (char ch : text.toLowerCase().toCharArray())
            if ("aeiou".indexOf(ch) >= 0) total++;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(count("Java Foundation"));
    }
}