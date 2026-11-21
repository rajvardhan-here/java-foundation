public class WordSearch {
    static boolean exists(char[][] board, String word) {
        if (word.isEmpty()) return true;
        for (int r = 0; r < board.length; r++)
            for (int c = 0; c < board[r].length; c++)
                if (search(board, word, r, c, 0)) return true;
        return false;
    }
    private static boolean search(char[][] b, String w, int r, int c, int i) {
        if (i == w.length()) return true;
        if (r < 0 || c < 0 || r == b.length || c == b[0].length || b[r][c] != w.charAt(i)) return false;
        char saved = b[r][c]; b[r][c] = '#';
        boolean found = search(b,w,r+1,c,i+1) || search(b,w,r-1,c,i+1)
            || search(b,w,r,c+1,i+1) || search(b,w,r,c-1,i+1);
        b[r][c] = saved;
        return found;
    }
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exists(board, "ABCCED"));
    }
}