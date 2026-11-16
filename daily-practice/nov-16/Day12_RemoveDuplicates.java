import java.util.Arrays;

public class Day12_RemoveDuplicates {
    static int uniqueCount(int[] sorted) {
        if (sorted.length == 0) return 0;
        int write = 1;
        for (int read = 1; read < sorted.length; read++) {
            if (sorted[read] != sorted[read - 1]) sorted[write++] = sorted[read];
        }
        return write;
    }
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 2, 3, 4, 4};
        int count = uniqueCount(values);
        System.out.println(Arrays.toString(Arrays.copyOf(values, count)));
    }
}
