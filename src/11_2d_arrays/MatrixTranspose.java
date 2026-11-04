import java.util.Arrays;
public class MatrixTranspose {
 public static int[][] transpose(int[][] m){if(m.length==0)return new int[0][0];int cols=m[0].length;for(int[] row:m)if(row.length!=cols)throw new IllegalArgumentException("Matrix must be rectangular");int[][] out=new int[cols][m.length];for(int r=0;r<m.length;r++)for(int c=0;c<cols;c++)out[c][r]=m[r][c];return out;}
 public static void main(String[] args){System.out.println(Arrays.deepToString(transpose(new int[][]{{1,2,3},{4,5,6}})));}
}