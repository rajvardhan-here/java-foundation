public class SecondLargest {
 public static int find(int[] a){long max=Long.MIN_VALUE,second=Long.MIN_VALUE;for(int x:a){if(x>max){second=max;max=x;}else if(x>second&&x<max)second=x;}if(second==Long.MIN_VALUE)throw new IllegalArgumentException("Two distinct values required");return(int)second;}
 public static void main(String[] args){System.out.println(find(new int[]{12,35,1,10,34,1}));}
}