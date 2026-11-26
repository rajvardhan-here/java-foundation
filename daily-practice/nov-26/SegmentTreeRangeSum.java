/** Segment tree for point updates and inclusive range-sum queries. */
public class SegmentTreeRangeSum {
    private final int n;
    private final long[] tree;
    public SegmentTreeRangeSum(int[] values) {
        n = values.length;
        tree = new long[Math.max(1, 4 * n)];
        if (n > 0) build(values, 1, 0, n - 1);
    }
    private void build(int[] a, int node, int left, int right) {
        if (left == right) { tree[node] = a[left]; return; }
        int mid = left + (right - left) / 2;
        build(a, node * 2, left, mid);
        build(a, node * 2 + 1, mid + 1, right);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }
    public void update(int index, int value) {
        if (index < 0 || index >= n) throw new IndexOutOfBoundsException();
        update(1, 0, n - 1, index, value);
    }
    private void update(int node, int l, int r, int index, int value) {
        if (l == r) { tree[node] = value; return; }
        int mid = l + (r - l) / 2;
        if (index <= mid) update(node * 2, l, mid, index, value);
        else update(node * 2 + 1, mid + 1, r, index, value);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }
    public long query(int ql, int qr) {
        if (ql < 0 || qr >= n || ql > qr) throw new IllegalArgumentException();
        return query(1, 0, n - 1, ql, qr);
    }
    private long query(int node, int l, int r, int ql, int qr) {
        if (ql <= l && r <= qr) return tree[node];
        int mid = l + (r - l) / 2;
        long sum = 0;
        if (ql <= mid) sum += query(node * 2, l, mid, ql, qr);
        if (qr > mid) sum += query(node * 2 + 1, mid + 1, r, ql, qr);
        return sum;
    }
    public static void main(String[] args) {
        SegmentTreeRangeSum st = new SegmentTreeRangeSum(new int[]{1, 3, 5, 7, 9});
        System.out.println(st.query(1, 3)); // 15
        st.update(2, 6);
        System.out.println(st.query(1, 3)); // 16
    }
}