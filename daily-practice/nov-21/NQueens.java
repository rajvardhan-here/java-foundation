import java.util.*;

public class NQueens {
    static List<List<String>> solve(int n) {
        List<List<String>> answers = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        place(0, board, new boolean[n], new boolean[2 * n], new boolean[2 * n], answers);
        return answers;
    }
    private static void place(int row, char[][] board, boolean[] cols, boolean[] diag,
                              boolean[] anti, List<List<String>> answers) {
        int n = board.length;
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] line : board) solution.add(new String(line));
            answers.add(solution); return;
        }
        for (int col = 0; col < n; col++) {
            int d = row - col + n, a = row + col;
            if (cols[col] || diag[d] || anti[a]) continue;
            cols[col] = diag[d] = anti[a] = true; board[row][col] = 'Q';
            place(row + 1, board, cols, diag, anti, answers);
            board[row][col] = '.'; cols[col] = diag[d] = anti[a] = false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Solutions for 4 queens: " + solve(4).size());
    }
}