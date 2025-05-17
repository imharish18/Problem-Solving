public class RotatingArray12 {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int k=2;
        rotate(arr, k);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public static void reverse(int[] nums, int i, int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
