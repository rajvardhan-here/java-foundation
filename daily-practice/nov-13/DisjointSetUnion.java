/** Union-Find with path compression and union by size. */
public class DisjointSetUnion {
    private final int[] parent, size;
    DisjointSetUnion(int n) {
        parent = new int[n]; size = new int[n];
        for (int i = 0; i < n; i++) { parent[i] = i; size[i] = 1; }
    }
    int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }
    boolean union(int a, int b) {
        int ra = find(a), rb = find(b);
        if (ra == rb) return false;
        if (size[ra] < size[rb]) { int t = ra; ra = rb; rb = t; }
        parent[rb] = ra; size[ra] += size[rb]; return true;
    }
    public static void main(String[] args) {
        DisjointSetUnion dsu = new DisjointSetUnion(5);
        dsu.union(0, 1); dsu.union(1, 2);
        System.out.println(dsu.find(0) == dsu.find(2));
    }
}