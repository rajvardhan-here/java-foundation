/** Finds the median of two sorted arrays in O(log(min(n,m))) time. */
public class MedianOfTwoSortedArrays {
    public static double median(int[] a,int[] b) {
        if(a.length>b.length) return median(b,a);
        int m=a.length,n=b.length; if(m+n==0) throw new IllegalArgumentException("Both arrays empty");
        int lo=0,hi=m;
        while(lo<=hi) {
            int i=(lo+hi)>>>1,j=(m+n+1)/2-i;
            int al=i==0?Integer.MIN_VALUE:a[i-1], ar=i==m?Integer.MAX_VALUE:a[i];
            int bl=j==0?Integer.MIN_VALUE:b[j-1], br=j==n?Integer.MAX_VALUE:b[j];
            if(al<=br && bl<=ar) return (m+n)%2==1?Math.max(al,bl):((long)Math.max(al,bl)+Math.min(ar,br))/2.0;
            if(al>br) hi=i-1; else lo=i+1;
        }
        throw new IllegalArgumentException("Inputs must be sorted");
    }
    public static void main(String[] args) { System.out.println(median(new int[]{1,3},new int[]{2})); // 2.0 }
}