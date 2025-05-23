class app{
    public static boolean isVal(int arr[], int capacity, int days){
        int dayCompleted = 1;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(sum+arr[i]<=capacity) sum+=arr[i];
            else{
                dayCompleted++;
                sum=arr[i];
            }
        }
        if(dayCompleted<=days) return true;
        else return false;
    }

    public static int shipWithinDays(int[] arr, int d) {
        int lo = Integer.MIN_VALUE, hi=0, n =arr.length;
        for(int i=0; i<n; i++){
            lo = Math.max(lo, arr[i]);
            hi += arr[i];
        }
        int capacity = hi;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            // int daysWihMid = isVal(arr, mid);
            if (isVal(arr, mid, d)) {
                capacity = mid;
                hi=mid-1;                
            }else lo=mid+1;}
        return capacity;
    }
    public static void main(String[] args){
        int[] ar = {3,2,2,4,1,4};
        System.out.println(shipWithinDays(ar, 3));
    }
}