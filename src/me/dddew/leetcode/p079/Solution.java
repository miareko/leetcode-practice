package me.dddew.leetcode.p079;

/**
 * @author miareko
 * @date 2020-10-26
 */
public class Solution {

    static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] used = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0)) {
                    used[i][j] = true;
                    if (dfs(board, used, i, j, word, 0)) {
                        return true;
                    }
                    used[i][j] = false;
                }
            }
        }
        return false;
    }

    boolean dfs(char[][] board, boolean[][] used, int row, int col, String word, int index) {

        if (index == word.length() - 1) {
            return true;
        }

        for (int i = 0; i < dir.length; i++) {
            int r = row + dir[i][0];
            int c = col + dir[i][1];
            if (next(used, r, c) && board[r][c] == word.charAt(index + 1)) {
                used[r][c] = true;
                if (dfs(board, used, r, c, word, index + 1)) {
                    return true;
                }
                used[r][c] = false;
            }
        }
        return false;
    }

    boolean next(boolean[][] used, int row, int col) {
        if (row < 0 || row >= used.length) {
            return false;
        }
        if (col < 0 || col >= used[0].length) {
            return false;
        }
        return !used[row][col];
    }
}
