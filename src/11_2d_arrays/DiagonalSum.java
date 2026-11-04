public class DiagonalSum {
 public static long sum(int[][] m){int n=m.length;for(int[] row:m)if(row.length!=n)throw new IllegalArgumentException("Matrix must be square");long total=0;for(int i=0;i<n;i++){total+=m[i][i];if(i!=n-1-i)total+=m[i][n-1-i];}return total;}
 public static void main(String[] args){System.out.println(sum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));}
}