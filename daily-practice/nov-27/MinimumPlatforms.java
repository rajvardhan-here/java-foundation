import java.util.*;
/** Minimum railway platforms needed for the given arrival/departure times. */
public class MinimumPlatforms {
    public static int required(int[] arrivals, int[] departures) {
        if (arrivals.length != departures.length) throw new IllegalArgumentException("Length mismatch");
        int[] a=arrivals.clone(), d=departures.clone(); Arrays.sort(a); Arrays.sort(d);
        int i=0,j=0,active=0,best=0;
        while(i<a.length) {
            if(j==d.length || a[i]<=d[j]) { active++; best=Math.max(best,active); i++; }
            else { active--; j++; }
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(required(new int[]{900,940,950,1100,1500,1800},new int[]{910,1200,1120,1130,1900,2000})); // 3
    }
}