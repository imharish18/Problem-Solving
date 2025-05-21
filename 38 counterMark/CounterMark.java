public class CounterMark{
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            for(int j=i; j>0 && arr[j]<arr[j-1]; j--)swap(arr, j, j-1);
        }
    }

    public static void counterMark(int[] ar){
        int n = ar.length;
        int counter = 0;

        for(int j=0; j<n; j++){
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int i=0; i<n; i++){
                if(ar[i]<min && ar[i]>0){
                    min = ar[i];
                    minIdx = i;
                }
            }
            ar[minIdx] = counter;
            counter--;
        }
    }
    public static void main(String[] args) {
        int[] ar = {3,5,1,4,2};

        for(int e : ar){
            System.out.print(e+" ");
        }

        counterMark(ar);

        System.out.println();
        System.out.println("array after ");
        for(int e : ar){
        System.out.print(e+" ");
        }
    }   
}

