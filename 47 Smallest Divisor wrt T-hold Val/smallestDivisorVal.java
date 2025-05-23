class smallestDivisorVal{
    public static boolean isL(int arr[], int mid, int t){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%mid==0) sum+=arr[i]/mid;
            else sum+=arr[i]/mid + 1;
        }
        if(sum<=t) return true;
        else return false;
    }
    public static int smallestDivisor(int[] arr, int t) {
        int d=1,n=arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
        }

        int lo=1,hi=max;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isL(arr, mid, t)){
                d = mid;
                hi = mid-1;
            }else lo = mid+1;
        }
        return d;
    }
    public static void main(String[] args){
        int[] ar = {44,22,33,11,1};
        System.out.println(smallestDivisor(ar,5));

    }
}