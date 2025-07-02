public class iam182 {
        int[] dp;

    public int tri(int n, int[] dp) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        if(dp[n]!=0) return dp[n];
        return dp[n] = tri(n-1,dp)+tri(n-2,dp)+tri(n-3,dp);
    }
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int[] dp = new int[n+1];
        dp[0]=0; dp[1]=1; dp[2]=1;
        return tri(n,dp);
    }

    // Tabulation Way
    public int tribonacci2(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int[] ans = new int[n+1];
        ans[1]=1; ans[2]=1;
        for(int i=3; i<n+1; i++){
            ans[i]=ans[i-1]+ans[i-2]+ans[i-3];
        }
        return ans[n];
    }

    // By Recursion Only
    public int tribonacci3(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        return tribonacci3(n-1)+tribonacci3(n-2)+tribonacci3(n-3);
    }
}
