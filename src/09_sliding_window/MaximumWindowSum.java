public class MaximumWindowSum {
 public static long maxSum(int[] a,int k){
  if(k<=0||k>a.length)throw new IllegalArgumentException("Invalid window size");
  long sum=0;for(int i=0;i<k;i++)sum+=a[i];long best=sum;
  for(int r=k;r<a.length;r++){sum+=a[r]-a[r-k];best=Math.max(best,sum);}return best;
 }
 public static void main(String[] args){System.out.println(maxSum(new int[]{2,1,5,1,3,2},3));}
}