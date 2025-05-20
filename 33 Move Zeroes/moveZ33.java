public class moveZ33 {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void moveZeroes(int[] nums) {
        int i =0,n=nums.length;

            for(int j=0; j<n; j++){
                if(nums[j]!=0){
                    if(i!=j){
                        swap(nums,i,j);
                    }
                    i++;
                }
        }
    }
    public static void main(String[] args) {
        int[] ar = {1,0,1,0,3,12};
        for(int e : ar){
            System.out.print(e+" ");
        }
        moveZeroes(ar);
        System.out.println();
        for(int e : ar){
        System.out.print(e+" ");
        }
    }   
}

