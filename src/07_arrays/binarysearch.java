public class binarysearch {

    // Prints every pair of elements whose first index is before the second.
    public static void printPairs(int[] numbers) {
        int totalPairs = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
                totalPairs++;
            }
        }

        System.out.println("Total pairs: " + totalPairs);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12};
        printPairs(numbers);
    }
}
