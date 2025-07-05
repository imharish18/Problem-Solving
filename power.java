import java.util.*;

public class power {
    public static int pairing(int n, int[] dp){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = pairing(n-1, dp)+(n-1)*pairing(n-2, dp);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n];
        dp[0]=1; dp[1]=2;
        for(int i=2; i<n; i++){
            dp[i] = dp[i-1]+(i)*dp[i-2];
        }
        System.out.println(dp[n-1]);
    }
}
