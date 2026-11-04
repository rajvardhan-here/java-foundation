public class MaximumAverageSubarray {
 public static double find(int[] a,int k){
  if(k<=0||k>a.length)throw new IllegalArgumentException("Invalid k");
  long sum=0;for(int i=0;i<k;i++)sum+=a[i];long best=sum;
  for(int r=k;r<a.length;r++){sum+=a[r]-a[r-k];best=Math.max(best,sum);}return (double)best/k;
 }
 public static void main(String[] args){System.out.println(find(new int[]{1,12,-5,-6,50,3},4));}
}