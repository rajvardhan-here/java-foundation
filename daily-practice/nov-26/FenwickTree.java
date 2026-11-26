import java.util.Arrays;

/** Binary Indexed Tree supporting point updates and prefix/range sums in O(log n). */
public class FenwickTree {
    private final int[] tree;
    public FenwickTree(int size) { tree = new int[size + 1]; }
    public void add(int index, int delta) {
        if (index < 0 || index >= tree.length - 1) throw new IndexOutOfBoundsException();
        for (int i = index + 1; i < tree.length; i += i & -i) tree[i] += delta;
    }
    public int prefixSum(int index) {
        if (index < 0) return 0;
        if (index >= tree.length - 1) throw new IndexOutOfBoundsException();
        int sum = 0;
        for (int i = index + 1; i > 0; i -= i & -i) sum += tree[i];
        return sum;
    }
    public int rangeSum(int left, int right) {
        if (left < 0 || right >= tree.length - 1 || left > right) throw new IllegalArgumentException();
        return prefixSum(right) - prefixSum(left - 1);
    }
    public static void main(String[] args) {
        int[] values = {2, 1, 3, 4, 5};
        FenwickTree bit = new FenwickTree(values.length);
        for (int i = 0; i < values.length; i++) bit.add(i, values[i]);
        System.out.println(bit.rangeSum(1, 3)); // 8
        bit.add(2, 2);
        System.out.println(bit.prefixSum(2)); // 8
    }
}