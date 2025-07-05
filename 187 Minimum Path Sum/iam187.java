import java.util.*;

public class iam187 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(grid, m - 1, n - 1, dp);
    }
    public int solve(int[][] grid,int m,int n, int[][] dp){
        if (m < 0 || n < 0) return Integer.MAX_VALUE;
        if(m==0 && n==0) return grid[0][0];
        if(dp[m][n]!=-1) return dp[m][n];
        int left = solve(grid,m-1,n,dp);
        int top = solve(grid,m,n-1,dp);
        return dp[m][n]=grid[m][n]+Math.min(left,top);
    }
}

