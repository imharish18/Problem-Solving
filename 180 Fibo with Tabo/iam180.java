public class iam180 {
    static int[] dp;
    public int fibo(int n) {
        if(n<2) return n;
        if(dp[n]!=0) return dp[n];
        int ans = fibo(n-1)+fibo(n-2);
        dp[n]=ans;
        return ans;
    }
    public int fibMemoization(int n) {
        dp = new int[n+1];
        return fibo(n);
    }


//Tabulation

    public int fib(int n) {
        if(n<2) return n;
        int[] ar = new int[n+1];
        ar[0]=0;
        ar[1]=1;
        for(int i=2; i<=n; i++){
            ar[i]=ar[i-1]+ar[i-2];
        }
        return ar[n];
    }
}
