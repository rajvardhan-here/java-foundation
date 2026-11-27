/** Rotates a square matrix 90 degrees clockwise in place. */
public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int[] row:matrix) if(row.length!=n) throw new IllegalArgumentException("Matrix must be square");
        for(int r=0;r<n;r++) for(int c=r+1;c<n;c++) {
            int t=matrix[r][c]; matrix[r][c]=matrix[c][r]; matrix[c][r]=t;
        }
        for(int[] row:matrix) for(int l=0,r=n-1;l<r;l++,r--) {
            int t=row[l]; row[l]=row[r]; row[r]=t;
        }
    }
    public static void main(String[] args) {
        int[][] m={{1,2,3},{4,5,6},{7,8,9}}; rotate(m);
        for(int[] row:m) System.out.println(java.util.Arrays.toString(row));
    }
}