import java.util.Arrays;

public class sortingO {

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,0,0,1,0};
        sortt3(arr);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
    public static void sortt1(int[] nums) {
        Arrays.sort(nums);
        
    }
    public static void sortt2(int[] nums) {
        int nOf0 = 0;
        for(int e: nums){
            if(e==0){
                nOf0++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i<nOf0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
    }
    public static void sortt3(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
           if(nums[i]==0){
            i++;            
           }
           else if(nums[j]==1){
            j--;
           }
           else if(nums[i]==1 && nums[j]==0){
            swapp(nums, i, j);
            i++;
            j--;
           }
        }
    }
    public static void swapp(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
   
}
