public class MinimumSizeSubarraySum {
 // Requires positive array values.
 public static int find(int target,int[] a){
  int left=0,best=Integer.MAX_VALUE;long sum=0;
  for(int right=0;right<a.length;right++){sum+=a[right];while(sum>=target){best=Math.min(best,right-left+1);sum-=a[left++];}}
  return best==Integer.MAX_VALUE?0:best;
 }
 public static void main(String[] args){System.out.println(find(7,new int[]{2,3,1,2,4,3}));}
}