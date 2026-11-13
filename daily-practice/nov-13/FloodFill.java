/** Four-direction flood fill on a rectangular image. */
public class FloodFill {
    static void fill(int[][] image, int row, int col, int color) {
        int old = image[row][col];
        if (old == color) return;
        dfs(image, row, col, old, color);
    }
    private static void dfs(int[][] a, int r, int c, int old, int color) {
        if (r < 0 || r >= a.length || c < 0 || c >= a[0].length || a[r][c] != old) return;
        a[r][c] = color;
        dfs(a, r + 1, c, old, color); dfs(a, r - 1, c, old, color);
        dfs(a, r, c + 1, old, color); dfs(a, r, c - 1, old, color);
    }
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        fill(image, 1, 1, 2);
        System.out.println(image[0][0] + " " + image[2][2]);
    }
}