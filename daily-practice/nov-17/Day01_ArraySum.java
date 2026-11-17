public class Day01_ArraySum {
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) total += number;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sum(new int[]{2, 4, 6, 8}));
    }
}