import java.util.*;




public class power {

    public static void findPrefixScore(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i==0) nums[i]=nums[i]*2;
            else nums[i]=nums[i]*2 + nums[i-1];
        }
        for(int x : nums){
            System.out.print(x+" ");
        }
    }
    public static void findPrefixScore2(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        long[] ans = new long[n];
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
            if(i==0) nums[i]=nums[i]+max;
            else ans[i]=nums[i]+max + nums[i-1];
        }
        for(long x : ans){
            System.out.print(x+" ");
        }
    }
    public static void slidingWindow(int[] ar, int k){
        int n = ar.length, i=1,j=k;
        int sum = 0;
        for(int a=0; a<k; a++){
            sum+=ar[a];
        }
        int maxSum = sum;
        while(j<n){
            sum=sum-ar[i-1]+ar[j];
            maxSum = Math.max(maxSum, sum);
            i++;j++;
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] nums = {10,20,1,3,-40,80,10};
        slidingWindow(nums,3);
        
    }
}
