/** Backtracking Sudoku solver. Empty cells are represented by zero. */
public class SudokuSolver {
    public static boolean solve(int[][] board) {
        for (int r = 0; r < 9; r++) for (int c = 0; c < 9; c++) {
            if (board[r][c] != 0) continue;
            for (int value = 1; value <= 9; value++) {
                if (isValid(board, r, c, value)) {
                    board[r][c] = value;
                    if (solve(board)) return true;
                    board[r][c] = 0;
                }
            }
            return false;
        }
        return true;
    }
    private static boolean isValid(int[][] b, int row, int col, int value) {
        for (int i = 0; i < 9; i++) if (b[row][i] == value || b[i][col] == value) return false;
        int sr = row / 3 * 3, sc = col / 3 * 3;
        for (int r = sr; r < sr + 3; r++) for (int c = sc; c < sc + 3; c++)
            if (b[r][c] == value) return false;
        return true;
    }
    public static void main(String[] args) {
        int[][] board = {
            {5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,7,9}
        };
        System.out.println(solve(board));
        System.out.println(board[0][2]); // 4
    }
}