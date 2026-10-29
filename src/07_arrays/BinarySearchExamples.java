/** Small examples showing binary search for found and missing values. */
public class BinarySearchExamples {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11};
        System.out.println(BinarySearch.binarySearch(numbers, 7));    // 3
        System.out.println(BinarySearch.binarySearch(numbers, 2));    // -1
        System.out.println(BinarySearch.binarySearch(new int[0], 4)); // -1
    }
}
