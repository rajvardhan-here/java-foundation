import java.util.Arrays;

/** Runnable examples for the LinearSearch utility methods. */
public class LinearSearchExamples {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 5, 20, 3};

        int target = 20;
        int index = LinearSearch.findFirst(numbers, target);
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("First index of " + target + ": " + index);
        System.out.println("Last index of 5: " + LinearSearch.findLast(numbers, 5));
        System.out.println("Occurrences of 5: " + LinearSearch.countOccurrences(numbers, 5));
        System.out.println("All indices of 5: "
                + Arrays.toString(LinearSearch.findAllIndices(numbers, 5)));
        System.out.println("Search 8 in range [2, 5): "
                + LinearSearch.findInRange(numbers, 8, 2, 5));
    }
}
