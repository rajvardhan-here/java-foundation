public class Day12_DecimalToBinary {
    public static String convert(int number) {
        if (number == 0) return "0";
        StringBuilder result = new StringBuilder();
        int value = number;
        while (value > 0) { result.append(value % 2); value /= 2; }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(convert(45)); // 101101
    }
}