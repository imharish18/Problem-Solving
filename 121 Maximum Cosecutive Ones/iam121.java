public class iam121 {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length, maxLen = Integer.MIN_VALUE, flips = 0, i=0,j=0;
        if(n==k) return n;
        while(j<n){
            if(nums[j]==1) j++;
            else{
                if(flips<k) {
                    flips++;
                    j++;
                }
                else{
                    maxLen = Math.max(maxLen,j-i);
                    while(nums[i]==1) i++;
                    i++;
                    j++;
                }
            }
        }
        maxLen = Math.max(maxLen,j-i);
    return maxLen;
    }
}

