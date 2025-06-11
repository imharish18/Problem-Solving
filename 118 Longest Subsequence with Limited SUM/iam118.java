import java.util.Arrays;

public class iam118 {
    public static int[] answerQueries(int[] nums, int[] queries) {

        int n = nums.length;
        int m = queries.length;
        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            nums[i] = nums[i]+nums[i-1];
        }
        for(int i=0; i<m; i++){
            int lo = 0 ;
            int hi = n-1;
            int maxLen = 0;
            while(lo<=hi){
                int mid = lo+(hi-lo)/2;
                if(nums[mid]>queries[i]) hi = mid-1;
                else{
                    maxLen = mid+1;
                    lo=mid+1;
                }
            }
            queries[i]=maxLen;
        }

        return queries;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,2,1};
        int[] q = {3,10,21};
        answerQueries(nums, q);
    }
}
