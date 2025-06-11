
public class iam120 {
        public int minSubArrayLen(int target, int[] ar) {
        int n = ar.length;
        int i=0, j=0;
        int len = 0;
        int maxLen = n+1;
        int sum = 0;
        while(j<n){
            sum+=ar[j];
            while(sum>=target){
                len=j-i+1;
                maxLen = Math.min(maxLen, len);
                sum-=ar[i];
                i++;
            }
            j++;
        }
        return maxLen==n+1 ? 0 : maxLen;
    }
}
