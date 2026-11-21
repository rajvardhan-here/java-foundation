import java.util.Arrays;

public class CountingSort {
    static void sort(int[] values) {
        if (values.length == 0) return;
        int min = values[0], max = values[0];
        for (int value : values) { min = Math.min(min, value); max = Math.max(max, value); }
        int[] count = new int[max - min + 1];
        for (int value : values) count[value - min]++;
        int index = 0;
        for (int i = 0; i < count.length; i++)
            while (count[i]-- > 0) values[index++] = i + min;
    }
    public static void main(String[] args) {
        int[] data = {4, -2, 2, 8, 3, 3, 1}; sort(data);
        System.out.println(Arrays.toString(data));
    }
}