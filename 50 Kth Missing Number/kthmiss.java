public class kthmiss {
    public static int findKthPositive(int[] arr, int k) {
        int ans = 0;
        int n=arr.length, hi = n-1, lo=0;
        int missed =0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            missed = arr[mid] - (mid+1);
            if(missed<k)lo=mid+1;
            else hi=mid-1;
        }
        missed = arr[hi]-(hi+1);
        System.out.println(arr[hi]+" "+arr[lo]+" "+missed);
        ans = arr[hi]+(k-missed);
        return ans;
    }    
}
