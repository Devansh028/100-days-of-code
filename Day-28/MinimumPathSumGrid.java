/* Question 1: Minimum Path Sum

Given an m x n grid filled with non-negative numbers, find a path from top-left to bottom-right that minimizes the sum, moving only right or down.

Example

grid = [
 [1,3,1],
 [1,5,1],
 [4,2,1]
]
Output = 7*/

public class MinimumPathSumGrid {

    public static int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 1; i < m; i++)
            grid[i][0] += grid[i - 1][0];

        for (int j = 1; j < n; j++)
            grid[0][j] += grid[0][j - 1];

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        System.out.println(minPathSum(grid));
    }
}