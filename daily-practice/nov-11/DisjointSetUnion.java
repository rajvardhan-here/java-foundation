/** Disjoint Set Union supports near-constant-time connectivity queries. */
public class DisjointSetUnion {
    private final int[] parent;
    private final int[] rank;

    public DisjointSetUnion(int size) {
        if (size < 0) throw new IllegalArgumentException("Size cannot be negative");
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) parent[i] = i;
    }

    public int find(int value) {
        if (parent[value] != value) parent[value] = find(parent[value]);
        return parent[value];
    }

    public boolean union(int a, int b) {
        int rootA = find(a), rootB = find(b);
        if (rootA == rootB) return false;
        if (rank[rootA] < rank[rootB]) parent[rootA] = rootB;
        else if (rank[rootA] > rank[rootB]) parent[rootB] = rootA;
        else { parent[rootB] = rootA; rank[rootA]++; }
        return true;
    }

    public boolean connected(int a, int b) { return find(a) == find(b); }

    public static void main(String[] args) {
        DisjointSetUnion dsu = new DisjointSetUnion(5);
        dsu.union(0, 1); dsu.union(1, 2);
        System.out.println(dsu.connected(0, 2)); // true
        System.out.println(dsu.connected(0, 4)); // false
    }
}