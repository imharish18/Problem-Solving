public class iam122 {
        public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, maxLen = Integer.MIN_VALUE, i=0,j=0;
        int len = 0;
        while(j<n){
            while(j<n && nums[j]==1){
                len++;
                j++;
            } 
            maxLen = Math.max(maxLen,len);
            while(j<n && nums[j]==0){   
                len=0;
                j++;
                i=j;
            }
            maxLen = Math.max(maxLen,len);
        }
    return maxLen;
    }
}
