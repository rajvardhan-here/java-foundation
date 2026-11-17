public class Day02_FindMinimum {
    public static int findMinimum(int[] numbers) {
        if (numbers == null || numbers.length == 0)
            throw new IllegalArgumentException("Array must not be empty");
        int minimum = numbers[0];
        for (int number : numbers)
            if (number < minimum) minimum = number;
        return minimum;
    }
    public static void main(String[] args) {
        System.out.println(findMinimum(new int[]{7, 3, 9, -2, 5}));
    }
}