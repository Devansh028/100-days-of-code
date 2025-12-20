import java.util.*;

public class NQueens {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');

        backtrack(0, board, res);
        return res;
    }

    private static void backtrack(int row, char[][] board, List<List<String>> res) {
        if (row == board.length) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board)
                solution.add(new String(r));
            res.add(solution);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(row + 1, board, res);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int r, int c) {
        for (int i = 0; i < r; i++)
            if (board[i][c] == 'Q')
                return false;

        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        for (int i = r - 1, j = c + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
