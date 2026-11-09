/** Finds a value occurring more than n/2 times, or returns null. */
public class MajorityElement {
    public static Integer find(int[] values) {
        if (values == null || values.length == 0) return null;

        int candidate = 0;
        int votes = 0;
        for (int value : values) {
            if (votes == 0) candidate = value;
            votes += (value == candidate) ? 1 : -1;
        }

        int count = 0;
        for (int value : values) {
            if (value == candidate) count++;
        }
        return count > values.length / 2 ? candidate : null;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 2, 1, 2, 3, 2, 2})); // 2
        System.out.println(find(new int[]{1, 2, 3}));             // null
    }
}
