import java.util.*;

public class binarysearch {
    public static void main(String[] args) {

        int[] numbers = {112, 4, 2, 12, 31, 21, 4123, 31, 1};
        System.out.println("Largest: " + largestNumber(numbers));
        System.out.println("Smallest: " + smallestNumber(numbers));
    }

    public static int largestNumber(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > largest) largest = num;
        }
        return largest;
    }

    public static int smallestNumber(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < smallest) smallest = num;
        }
        return smallest;
    }
}