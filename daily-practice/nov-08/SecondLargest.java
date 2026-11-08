/** Finds the second distinct largest value without sorting. */
public class SecondLargest {
    public static int find(int[] values) {
        if (values == null || values.length < 2) {
            throw new IllegalArgumentException("At least two values are required");
        }
        long largest = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        for (int value : values) {
            if (value > largest) {
                second = largest;
                largest = value;
            } else if (value < largest && value > second) {
                second = value;
            }
        }
        if (second == Long.MIN_VALUE) {
            throw new IllegalArgumentException("No distinct second largest value");
        }
        return (int) second;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[] { 12, 35, 1, 10, 34, 1 }));
    }
}