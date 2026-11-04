public class MissingNumber {
 // Input contains distinct values from 0 through n, with exactly one missing.
 public static int find(int[] a){long expected=(long)a.length*(a.length+1)/2,actual=0;for(int x:a)actual+=x;return(int)(expected-actual);}
 public static void main(String[] args){System.out.println(find(new int[]{3,0,1}));}
}