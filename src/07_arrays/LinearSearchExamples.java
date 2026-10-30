import java.util.Arrays;

/** Small runnable examples for LinearSearch. */
public class LinearSearchExamples {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 5, 20, 3};

        int target = 20;
        int index = LinearSearch.findFirst(numbers, target);
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("First index of " + target + ": " + index);
    }
}
