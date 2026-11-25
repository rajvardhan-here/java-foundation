/** Disjoint Set Union with path compression and union by size. */
public class UnionFind {
    private final int[] parent;
    private final int[] size;

    public UnionFind(int n) {
        if (n < 0) throw new IllegalArgumentException("Size cannot be negative");
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    private void check(int value) {
        if (value < 0 || value >= parent.length) throw new IndexOutOfBoundsException(value);
    }

    public int find(int value) {
        check(value);
        if (parent[value] != value) parent[value] = find(parent[value]);
        return parent[value];
    }

    public boolean union(int a, int b) {
        int rootA = find(a), rootB = find(b);
        if (rootA == rootB) return false;
        if (size[rootA] < size[rootB]) {
            int temp = rootA; rootA = rootB; rootB = temp;
        }
        parent[rootB] = rootA;
        size[rootA] += size[rootB];
        return true;
    }

    public boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    public static void main(String[] args) {
        UnionFind sets = new UnionFind(5);
        sets.union(0, 1);
        sets.union(1, 2);
        if (!sets.connected(0, 2) || sets.connected(0, 4)) {
            throw new AssertionError("UnionFind checks failed");
        }
        System.out.println("UnionFind checks passed");
    }
}