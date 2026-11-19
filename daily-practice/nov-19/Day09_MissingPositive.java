public class Day09_MissingPositive {
    public static int find(int[] values) {
        boolean[] present = new boolean[values.length + 2];
        for (int value : values) if (value > 0 && value < present.length) present[value] = true;
        for (int i = 1; i < present.length; i++) if (!present[i]) return i;
        return present.length;
    }
    public static void main(String[] args) {
        System.out.println(find(new int[]{3, 4, -1, 1})); // 2
    }
}