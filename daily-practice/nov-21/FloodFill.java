import java.util.Arrays;

public class FloodFill {
    static int[][] fill(int[][] image, int row, int col, int color) {
        int original = image[row][col];
        if (original == color) return image;
        dfs(image, row, col, original, color);
        return image;
    }
    private static void dfs(int[][] image, int r, int c, int oldColor, int newColor) {
        if (r < 0 || c < 0 || r == image.length || c == image[0].length || image[r][c] != oldColor) return;
        image[r][c] = newColor;
        dfs(image, r - 1, c, oldColor, newColor); dfs(image, r + 1, c, oldColor, newColor);
        dfs(image, r, c - 1, oldColor, newColor); dfs(image, r, c + 1, oldColor, newColor);
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        for (int[] row : fill(image, 1, 1, 2)) System.out.println(Arrays.toString(row));
    }
}