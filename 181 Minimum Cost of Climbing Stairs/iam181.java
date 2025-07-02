import java.util.*;
public class iam181 {
    public int minCostClimbingStairs2(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2; i<n; i++) dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        return Math.min(dp[n-1],dp[n-2]);
    }

    // Recursion + Memoization
    public int minCost(int[] cost, int i, int[] dp){
        if(i==0 || i==1) return cost[i];
        if(dp[i]!=-1) return dp[i];
        return dp[i] = cost[i] + Math.min(minCost(cost,i-1,dp),minCost(cost,i-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
    }
}
