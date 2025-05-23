public class selectionSor {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){

            int min=Integer.MAX_VALUE;
            int minIdx=-1;
            for(int j=i; j<n; j++){
                if(min>arr[j]){ 
                    min=arr[j];
                    minIdx = j;
                }
            }
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

