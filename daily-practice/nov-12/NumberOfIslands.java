/** Counts connected groups of land in a rectangular grid. */
public class NumberOfIslands {
    public static int count(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int islands = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == '1') {
                    islands++;
                    sink(grid, row, col);
                }
            }
        }
        return islands;
    }

    private static void sink(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length
                || grid[row][col] != '1') {
            return;
        }

        grid[row][col] = '0';
        sink(grid, row - 1, col);
        sink(grid, row + 1, col);
        sink(grid, row, col - 1);
        sink(grid, row, col + 1);
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0'},
            {'1', '0', '0', '1'},
            {'0', '0', '1', '1'}
        };
        System.out.println(count(grid));
    }
}
