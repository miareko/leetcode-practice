package me.dddew.leetcode.p240;

/**
 * @author miareko
 * @date 2020-10-24
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        int cols = matrix[0].length;
        if (cols == 0) {
            return false;
        }

        int r = rows - 1;
        int c = 0;
        while (r >= 0 && c < cols) {
            if (matrix[r][c] == target) {
                return true;
            }
            if (matrix[r][c] > target) {
                r--;
            } else {
                c++;
            }
        }
        return false;
    }
}
