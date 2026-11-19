import java.util.Arrays;
public class Day07_MoveZeros {
    public static void move(int[] values) {
        int write = 0;
        for (int value : values) if (value != 0) values[write++] = value;
        while (write < values.length) values[write++] = 0;
    }
    public static void main(String[] args) {
        int[] data = {0, 1, 0, 3, 12}; move(data);
        System.out.println(Arrays.toString(data)); // [1, 3, 12, 0, 0]
    }
}