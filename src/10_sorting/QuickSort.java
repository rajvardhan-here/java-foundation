import java.util.Arrays;
public class QuickSort {
 public static void sort(int[] a){quickSort(a,0,a.length-1);}
 private static void quickSort(int[] a,int lo,int hi){if(lo>=hi)return;int p=partition(a,lo,hi);quickSort(a,lo,p-1);quickSort(a,p+1,hi);}
 private static int partition(int[] a,int lo,int hi){int pivot=a[hi],b=lo;for(int i=lo;i<hi;i++)if(a[i]<=pivot){int t=a[i];a[i]=a[b];a[b]=t;b++;}int t=a[b];a[b]=a[hi];a[hi]=t;return b;}
 public static void main(String[] args){int[] a={10,7,8,9,1,5};sort(a);System.out.println(Arrays.toString(a));}
}