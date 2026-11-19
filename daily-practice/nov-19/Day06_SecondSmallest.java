public class Day06_SecondSmallest {
    public static int find(int[] values) {
        if (values == null || values.length < 2) throw new IllegalArgumentException("Need two values");
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int value : values) {
            if (value < first) { second = first; first = value; }
            else if (value > first && value < second) second = value;
        }
        if (second == Integer.MAX_VALUE) throw new IllegalArgumentException("Need two distinct values");
        return second;
    }
    public static void main(String[] args) {
        System.out.println(find(new int[]{8, 3, 5, 3, 1})); // 3
    }
}