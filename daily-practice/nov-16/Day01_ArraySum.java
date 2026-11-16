public class Day01_ArraySum {
    static int sum(int[] values) {
        int total = 0;
        for (int value : values) total += value;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sum(new int[]{2, 4, 6, 8}));
    }
}
