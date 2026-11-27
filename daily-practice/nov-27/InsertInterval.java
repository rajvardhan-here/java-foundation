import java.util.*;
/** Inserts an interval into sorted, non-overlapping intervals and merges overlaps. */
public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] added) {
        List<int[]> out=new ArrayList<>(); int i=0, start=added[0], end=added[1];
        while(i<intervals.length && intervals[i][1]<start) out.add(intervals[i++]);
        while(i<intervals.length && intervals[i][0]<=end) {
            start=Math.min(start,intervals[i][0]); end=Math.max(end,intervals[i][1]); i++;
        }
        out.add(new int[]{start,end});
        while(i<intervals.length) out.add(intervals[i++]);
        return out.toArray(new int[out.size()][]);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(insert(new int[][]{{1,3},{6,9}},new int[]{2,5}))); // [[1, 5], [6, 9]]
    }
}