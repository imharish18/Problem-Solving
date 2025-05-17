import java.util.Arrays;

public class threePointer {

    public static void main(String[] args) {
        int[] arr = {0,1,2,1,2,1,0,1,2,0,1,2,1,2,2,2,1,0,0,0,1,2,0,1,2,0,2,1,0};
        sorttColor(arr);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
    public static void sorttColor(int[] nums) {
        int n=nums.length;
        int lo = 0;
        int mid = 0;
        int hi = n-1;
        while (mid<=hi) {
            if(nums[mid]==0){
                swp(nums, lo, mid);
                lo++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swp(nums, mid, hi);
                hi--;
                
            }
        }
    }
    public static void swp(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
}

