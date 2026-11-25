/** Counts connected groups of land in a rectangular grid using iterative DFS. */
public class NumberOfIslands {
    public static int count(char[][] grid) {
        if (grid == null) throw new IllegalArgumentException("grid must not be null");
        if (grid.length == 0) return 0;
        int cols = grid[0].length;
        for (char[] row : grid) {
            if (row == null || row.length != cols) {
                throw new IllegalArgumentException("Grid must be rectangular");
            }
        }
        boolean[][] visited = new boolean[grid.length][cols];
        int islands = 0;
        int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] != '1' || visited[r][c]) continue;
                islands++;
                int[] stack = new int[grid.length * Math.max(1, cols)];
                int top = 0;
                stack[top++] = r * cols + c;
                visited[r][c] = true;
                while (top > 0) {
                    int cell = stack[--top], row = cell / cols, col = cell % cols;
                    for (int d = 0; d < 4; d++) {
                        int nr = row + dr[d], nc = col + dc[d];
                        if (nr >= 0 && nr < grid.length && nc >= 0 && nc < cols
                                && grid[nr][nc] == '1' && !visited[nr][nc]) {
                            visited[nr][nc] = true;
                            stack[top++] = nr * cols + nc;
                        }
                    }
                }
            }
        }
        return islands;
    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','0','0'}, {'1','0','0','1'}, {'0','0','1','1'}};
        if (count(grid) != 2) throw new AssertionError("Island count check failed");
        System.out.println("NumberOfIslands checks passed");
    }
}