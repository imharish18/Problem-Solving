import java.util.*;

public class iam185 {
    public static int pairing(int n){
        if(n<=1) return 1;
        return pairing(n-1)+(n-1)*pairing(n-2);
    }
    public static int pairingDP(int n, int[] dp){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = pairingDP(n-1, dp)+(n-1)*pairingDP(n-2, dp);
    }
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(pairingDP(n,dp));
    }
    public static void Tabulation() {
        int n = 5;
        int[] dp = new int[n];
        dp[0]=1; dp[1]=2;
        for(int i=2; i<n; i++){
            dp[i] = dp[i-1]+(i)*dp[i-2];
        }
        System.out.println(dp[n-1]);
    }
}
