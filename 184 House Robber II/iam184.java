import java.util.*;
public class iam184 {
    public int roblinear(int[] nums, int i, int n){
        int[] dp = new int[n+1];
        dp[i]=nums[i]; dp[i+1]=Math.max(dp[i],nums[i+1]);
        for(int j=i+2; j<=n; j++){
            dp[j]=Math.max(nums[j]+dp[j-2],dp[j-1]);
        }
        return dp[n];
    }
    public int rob(int[] nums) {
        int n = nums.length;        
        if(n<=1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        return Math.max(roblinear(nums,0,n-2),roblinear(nums,1,n-1));
        
    }
    // Recursion
    public int robRecursive(int[] nums, int i, int n, int[] dp){
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        int rob = nums[i]+robRecursive(nums,i+2,n,dp);
        int skip = robRecursive(nums,i+1,n,dp);
        return dp[i] =  Math.max(rob,skip);
    }
    public int rob2(int[] nums) {
        int n = nums.length;        
        if(n<=1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int case1 = robRecursive(nums, 0, n - 2, dp);
        Arrays.fill(dp, -1);
        int case2 = robRecursive(nums, 1, n - 1, dp);
        return Math.max(case1,case2);
    }
}

