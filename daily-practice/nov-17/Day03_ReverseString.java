public class Day03_ReverseString {
    public static String reverse(String input) {
        if (input == null) return null;
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        System.out.println(reverse("java"));
    }
}