/**
 * Counts connected groups of land ('1') in a rectangular grid.
 * Time: O(rows * columns), Space: O(rows * columns) worst-case recursion.
 */
public class NumberOfIslands {
    public static int countIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == '1') {
                    count++;
                    sink(grid, row, col);
                }
            }
        }
        return count;
    }

    private static void sink(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0
                || col >= grid[row].length || grid[row][col] != '1') {
            return;
        }

        grid[row][col] = '0';
        sink(grid, row - 1, col);
        sink(grid, row + 1, col);
        sink(grid, row, col - 1);
        sink(grid, row, col + 1);
    }

    public static void main(String[] args) {
        char[][] map = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '1'},
            {'0', '0', '1', '0', '1'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println("Number of islands: " + countIslands(map)); // 3
    }
}
