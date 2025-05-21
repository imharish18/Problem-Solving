public class selectionSortReverse {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=n-1; i>=0; i--){

            int max=Integer.MIN_VALUE;
            int maxIdx=-1;
            for(int j=i; j>=0; j--){
                if(max<arr[j]){ 
                    max=arr[j];
                    maxIdx = j;
                }
            }
            swap(arr, i, maxIdx); 

        }

    }
    public static void main(String[] args) {
        int[] ar = {1,2,3,6,5,4};
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

