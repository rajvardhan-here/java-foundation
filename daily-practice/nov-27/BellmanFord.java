import java.util.*;
/** Bellman-Ford shortest paths; reports whether a reachable negative cycle exists. */
public class BellmanFord {
    public static final class Result {
        public final long[] distance; public final boolean negativeCycle;
        Result(long[] d,boolean c){distance=d;negativeCycle=c;}
    }
    public static Result solve(int vertices,int[][] edges,int source) {
        long inf=Long.MAX_VALUE/4; long[] d=new long[vertices]; Arrays.fill(d,inf); d[source]=0;
        for(int i=1;i<vertices;i++) {
            boolean changed=false;
            for(int[] e:edges) if(d[e[0]]!=inf && d[e[0]]+e[2]<d[e[1]]) {
                d[e[1]]=d[e[0]]+e[2]; changed=true;
            }
            if(!changed) break;
        }
        for(int[] e:edges) if(d[e[0]]!=inf && d[e[0]]+e[2]<d[e[1]]) return new Result(d,true);
        return new Result(d,false);
    }
    public static void main(String[] args) {
        Result r=solve(3,new int[][]{{0,1,4},{0,2,5},{1,2,-2}},0);
        System.out.println(Arrays.toString(r.distance)+" cycle="+r.negativeCycle);
    }
}