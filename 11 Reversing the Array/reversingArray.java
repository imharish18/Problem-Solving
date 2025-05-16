public class reversingArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int size = nums.length-1;
        for(int i=0; i<nums.length/2; i++){
            int temp = nums[i];
            nums[i]=nums[size-i];
            nums[size-i]=temp;          
        }
        for(int i: nums){
            System.out.print(i+" ");
        }
    }
}
