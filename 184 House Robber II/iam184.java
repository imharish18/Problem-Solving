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
}

