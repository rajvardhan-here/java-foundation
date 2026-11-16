public class Day03_LinearSearch {
    static int search(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{5, 9, 1, 7}, 1));
    }
}
