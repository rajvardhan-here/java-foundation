import java.util.*;
public class ThreeSum {
 public static List<List<Integer>> find(int[] input) {
  int[] a=input.clone(); Arrays.sort(a); List<List<Integer>> out=new ArrayList<>();
  for(int i=0;i<a.length-2;i++){ if(i>0&&a[i]==a[i-1])continue; int l=i+1,r=a.length-1;
   while(l<r){ long s=(long)a[i]+a[l]+a[r]; if(s==0){out.add(Arrays.asList(a[i],a[l],a[r]));l++;r--;while(l<r&&a[l]==a[l-1])l++;while(l<r&&a[r]==a[r+1])r--;}else if(s<0)l++;else r--; }
  } return out;
 }
 public static void main(String[] args){System.out.println(find(new int[]{-1,0,1,2,-1,-4}));}
}