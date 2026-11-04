import java.util.*;
public class SpiralTraversal {
 public static List<Integer> traverse(int[][] m){List<Integer> out=new ArrayList<>();if(m.length==0)return out;int rows=m.length,cols=m[0].length;for(int[] row:m)if(row.length!=cols)throw new IllegalArgumentException("Matrix must be rectangular");int top=0,bottom=rows-1,left=0,right=cols-1;while(top<=bottom&&left<=right){for(int c=left;c<=right;c++)out.add(m[top][c]);top++;for(int r=top;r<=bottom;r++)out.add(m[r][right]);right--;if(top<=bottom){for(int c=right;c>=left;c--)out.add(m[bottom][c]);bottom--;}if(left<=right){for(int r=bottom;r>=top;r--)out.add(m[r][left]);left++;}}return out;}
 public static void main(String[] args){System.out.println(traverse(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));}
}