import java.util.Arrays;
public class MergeSort {
 public static void sort(int[] a){if(a.length>1)sort(a,new int[a.length],0,a.length-1);}
 private static void sort(int[] a,int[] t,int lo,int hi){if(lo>=hi)return;int m=lo+(hi-lo)/2;sort(a,t,lo,m);sort(a,t,m+1,hi);int i=lo,j=m+1,k=lo;while(i<=m&&j<=hi)t[k++]=a[i]<=a[j]?a[i++]:a[j++];while(i<=m)t[k++]=a[i++];while(j<=hi)t[k++]=a[j++];for(int p=lo;p<=hi;p++)a[p]=t[p];}
 public static void main(String[] args){int[] a={38,27,43,3,9,82,10};sort(a);System.out.println(Arrays.toString(a));}
}