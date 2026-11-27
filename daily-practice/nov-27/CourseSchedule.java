import java.util.*;
/** Determines whether all courses can be completed using Kahn's topological sort. */
public class CourseSchedule {
    public static boolean canFinish(int n,int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>(); int[] indegree=new int[n];
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int[] edge:prerequisites) { graph.get(edge[1]).add(edge[0]); indegree[edge[0]]++; }
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++) if(indegree[i]==0) q.offer(i);
        int done=0;
        while(!q.isEmpty()) { int u=q.poll(); done++; for(int v:graph.get(u)) if(--indegree[v]==0) q.offer(v); }
        return done==n;
    }
    public static void main(String[] args) { System.out.println(canFinish(2,new int[][]{{1,0}})); // true }
}