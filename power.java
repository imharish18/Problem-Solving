import java.util.*;

class power{
    public static void maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        int n= nums.length;
        int i = 1, j = k;
        long maxSum = 0;
        long prevSum = 0;
        for(int x=0; x<k; x++){
            if(s.contains(nums[x])){
                prevSum = 0;
                break;
            }else{
                s.add(nums[x]);
                prevSum+=nums[x];
            }
        }
        while(j<n){
            long currSum = prevSum + nums[j] - nums[i-1];
            s.remove(nums[i-1]);
            if(s.contains(nums[j])){
                i++;
                j++;
                continue;
            }else{
                s.add(nums[j]);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
                prevSum = currSum;
            }
            i++;
            j++;
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,7,8,9};
        maximumSubarraySum(nums, 2);

    }
}