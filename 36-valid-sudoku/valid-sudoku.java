import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Checking each row
        for (int row = 0; row < 9; row++) {
            if (!isUnitValid(board[row])) {
                return false;
            }
        }

        // Checking each column
        for (int i = 0; i < 9; i++) {
            char[] column = new char[9];
            for (int j = 0; j < 9; j++) {
                column[j] = board[j][i];
            }
            if (!isUnitValid(column)) {
                return false;
            }
        }

        // Checking each 3x3 sub-grid
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isSquareValid(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isUnitValid(char[] unit) {
        HashSet<Character> seen = new HashSet<>();
        for (char c : unit) {
            if (c != '.') {
                if (seen.contains(c)) {
                    return false;
                }
                seen.add(c);
            }
        }
        return true;
    }

    private boolean isSquareValid(char[][] board, int row, int col) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] != '.') {
                    if (seen.contains(board[i][j])) {
                        return false;
                    }
                    seen.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
