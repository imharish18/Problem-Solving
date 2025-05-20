public class selectionSort {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        System.out.println("Swapping "+nums[i]+" "+nums[j]);
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){

            int min=Integer.MAX_VALUE;
            int minIdx=-1;
            for(int j=i; j<n; j++){
                if(min>arr[j]){ 
                    min=arr[j];
                    minIdx = j;
                }
            }
            System.out.println("\nThe minimum value is at index: "+minIdx);
            swap(arr, i, minIdx); 

        }

    }
    public static void main(String[] args) {
        int[] ar = {10,-4,20,1,-6,8};
        for(int e : ar){
            System.out.print(e+" ");
        }
        selectionSort(ar);

        System.out.println();

        for(int e : ar){
        System.out.print(e+" ");
        }
    }   
}

