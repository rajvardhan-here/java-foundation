import java.util.*;
/** Dijkstra shortest paths for a graph with non-negative edge weights. */
public class DijkstraShortestPath {
    public static int[] distances(List<List<int[]>> graph,int source) {
        int n=graph.size(); int[] dist=new int[n]; Arrays.fill(dist,Integer.MAX_VALUE); dist[source]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1])); pq.offer(new int[]{source,0});
        while(!pq.isEmpty()) {
            int[] cur=pq.poll(); int u=cur[0],d=cur[1]; if(d!=dist[u]) continue;
            for(int[] edge:graph.get(u)) {
                int v=edge[0],w=edge[1]; if(w<0) throw new IllegalArgumentException("Negative edge");
                if(d<=Integer.MAX_VALUE-w && d+w<dist[v]) { dist[v]=d+w; pq.offer(new int[]{v,dist[v]}); }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        List<List<int[]>> g=new ArrayList<>(); for(int i=0;i<4;i++) g.add(new ArrayList<>());
        g.get(0).add(new int[]{1,4}); g.get(0).add(new int[]{2,1}); g.get(2).add(new int[]{1,2}); g.get(1).add(new int[]{3,1});
        System.out.println(Arrays.toString(distances(g,0))); // [0, 3, 1, 4]
    }
}