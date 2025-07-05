public class iam186 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0) dp[i][j]=1;
                else dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    // With Recursion + Memoization
    public int Paths(int m, int n, int[][] dp) {
        if(m==1 || n==1) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        return dp[m][n] = Paths(m-1,n,dp)+Paths(m,n-1,dp);
    }
    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return Paths(m,n,dp);
    }
}
