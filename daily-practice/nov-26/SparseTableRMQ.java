/** Static range-minimum queries in O(1) after O(n log n) preprocessing. */
public class SparseTableRMQ {
    private final int[][] table;
    private final int[] log;
    public SparseTableRMQ(int[] a) {
        if (a.length == 0) throw new IllegalArgumentException("Array must not be empty");
        log = new int[a.length + 1];
        for (int i = 2; i < log.length; i++) log[i] = log[i / 2] + 1;
        table = new int[log[a.length] + 1][a.length];
        System.arraycopy(a, 0, table[0], 0, a.length);
        for (int k = 1; k < table.length; k++)
            for (int i = 0; i + (1 << k) <= a.length; i++)
                table[k][i] = Math.min(table[k - 1][i], table[k - 1][i + (1 << (k - 1))]);
    }
    public int min(int left, int right) {
        if (left < 0 || right >= table[0].length || left > right) throw new IllegalArgumentException();
        int k = log[right - left + 1];
        return Math.min(table[k][left], table[k][right - (1 << k) + 1]);
    }
    public static void main(String[] args) {
        SparseTableRMQ rmq = new SparseTableRMQ(new int[]{8, 2, 6, 3, 9, 1, 5});
        System.out.println(rmq.min(1, 4)); // 2
        System.out.println(rmq.min(3, 6)); // 1
    }
}