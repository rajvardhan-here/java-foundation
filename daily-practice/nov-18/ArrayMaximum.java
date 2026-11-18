public class ArrayMaximum {
    static int findMaximum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) maximum = number;
        }
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println(findMaximum(new int[] {4, 9, 2, 15, 7}));
    }
}
