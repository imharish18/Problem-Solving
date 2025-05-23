public class shopsDist {
    public static boolean isVal(int arr[], int shops, int capacity){
        int n = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%capacity==0) n+=arr[i]/capacity;
            else n+=arr[i]/capacity +1;
            if(n>shops) return false;
        }
        System.out.println("we cant fit the "+shops+" with capacity "+capacity);
        return true;
    }
    public static int minimizedMaximum(int shops, int[] arr) {
        int n=arr.length;
        int hi = Integer.MIN_VALUE, lo=1;
        for(int i=0; i<n; i++){
        hi = Math.max(hi, arr[i]);
        }
        int val = 0;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isVal(arr, shops, mid)){
                val = mid;
                hi=mid-1;
            }else lo = mid+1;
        }
        return val;
    }
}
