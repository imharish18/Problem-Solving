import java.util.Arrays;

public class iam117 {
    public static int maxSatisfaction(int[] ar) {
        int n = ar.length;
        Arrays.sort(ar);
        int[] suf = new int[n];
        int val = 0;
        for(int i=n-1; i>=0; i--){
            val+=ar[i];
            suf[i]=val;
        }

        int idx=-1;
        for(int i=0; i<n; i++){
            if(suf[i]>=0){
                idx=i;
                break;
            }
        }
        if(idx==-1) return 0;

        int maxSum = 0;
        int x = 1;
        for(int i=idx; i<n; i++){
            maxSum += ar[i]*x;
            x++;
        }
        System.out.println(maxSum);
        return maxSum;
    }
    public static void main(String[] args) {
        int[] ar = {-1,-8,0,5,-9};
        maxSatisfaction(ar);
        
    }
}
