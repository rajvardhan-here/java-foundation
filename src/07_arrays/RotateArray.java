import java.util.Arrays;
public class RotateArray {
 public static void rotateRight(int[] a,int steps){if(a.length==0)return;int k=Math.floorMod(steps,a.length);reverse(a,0,a.length-1);reverse(a,0,k-1);reverse(a,k,a.length-1);}
 private static void reverse(int[] a,int l,int r){while(l<r){int t=a[l];a[l++]=a[r];a[r--]=t;}}
 public static void main(String[] args){int[] a={1,2,3,4,5,6,7};rotateRight(a,3);System.out.println(Arrays.toString(a));}
}