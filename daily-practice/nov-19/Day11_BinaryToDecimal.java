public class Day11_BinaryToDecimal {
    public static int convert(String binary) {
        if (binary == null || binary.isEmpty()) throw new IllegalArgumentException("Binary value required");
        int result = 0;
        for (char bit : binary.toCharArray()) {
            if (bit != '0' && bit != '1') throw new IllegalArgumentException("Only 0 and 1 are allowed");
            result = Math.addExact(Math.multiplyExact(result, 2), bit - '0');
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(convert("101101")); // 45
    }
}