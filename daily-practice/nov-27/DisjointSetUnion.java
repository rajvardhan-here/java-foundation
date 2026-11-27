/** Union-Find with path compression and union by size. */
public class DisjointSetUnion {
    private final int[] parent,size;
    public DisjointSetUnion(int n) {
        if(n<0) throw new IllegalArgumentException("Negative size");
        parent=new int[n]; size=new int[n];
        for(int i=0;i<n;i++){ parent[i]=i; size[i]=1; }
    }
    public int find(int x) {
        if(x<0||x>=parent.length) throw new IndexOutOfBoundsException();
        if(parent[x]!=x) parent[x]=find(parent[x]); return parent[x];
    }
    public boolean union(int a,int b) {
        int x=find(a),y=find(b); if(x==y) return false;
        if(size[x]<size[y]) { int t=x;x=y;y=t; }
        parent[y]=x; size[x]+=size[y]; return true;
    }
    public static void main(String[] args) {
        DisjointSetUnion d=new DisjointSetUnion(5); d.union(0,1); d.union(1,2);
        System.out.println(d.find(0)==d.find(2)); // true
    }
}