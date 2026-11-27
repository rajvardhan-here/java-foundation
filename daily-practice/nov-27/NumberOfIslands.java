/** Counts connected groups of land in a rectangular grid. */
public class NumberOfIslands {
    public static int count(char[][] grid) {
        if(grid.length==0) return 0;
        int rows=grid.length,cols=grid[0].length,count=0;
        for(char[] row:grid) if(row.length!=cols) throw new IllegalArgumentException("Ragged grid");
        for(int r=0;r<rows;r++) for(int c=0;c<cols;c++) if(grid[r][c]=='1') {
            count++; flood(grid,r,c);
        }
        return count;
    }
    private static void flood(char[][] g,int r,int c) {
        if(r<0||c<0||r==g.length||c==g[0].length||g[r][c]!='1') return;
        g[r][c]='0'; flood(g,r+1,c); flood(g,r-1,c); flood(g,r,c+1); flood(g,r,c-1);
    }
    public static void main(String[] args) {
        char[][] g={"11000".toCharArray(),"11000".toCharArray(),"00100".toCharArray(),"00011".toCharArray()};
        System.out.println(count(g)); // 3
    }
}