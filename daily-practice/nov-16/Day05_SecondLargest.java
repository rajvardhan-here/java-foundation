public class Day05_SecondLargest {
    static int secondLargest(int[] values) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > largest) { second = largest; largest = value; }
            else if (value > second && value < largest) second = value;
        }
        if (second == Integer.MIN_VALUE) throw new IllegalArgumentException("No distinct second largest value");
        return second;
    }
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{8, 3, 12, 12, 5}));
    }
}
