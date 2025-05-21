public class insertionSortClass {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                    if(arr[j]<arr[j-1]){
                        swap(arr, j, j-1);
                    }else break;
            }
        }
    }
    public static void main(String[] args) {
        int[] ar = {3,5,1,4,2};
        for(int e : ar){
            System.out.print(e+" ");
        }
        insertionSort(ar);

        System.out.println();
        System.out.println("array after sort ");
        for(int e : ar){
        System.out.print(e+" ");
        }
    }   
}

