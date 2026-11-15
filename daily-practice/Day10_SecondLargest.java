public class Day10_SecondLargest {
    static int secondLargest(int[] a) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : a) {
            if (n > first) { second = first; first = n; }
            else if (n > second && n < first) second = n;
        }
        if (second == Integer.MIN_VALUE) throw new IllegalArgumentException("No second distinct value");
        return second;
    }
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{8, 3, 12, 12, 5}));
    }
}