public class binaryUBLB {
    public static int bsLowerBound(int[] ar, int target) {
        int lo=0,hi=ar.length-1,n=ar.length;
        int lb = n-1;

        while(lo<=hi){
            int mid = (hi-lo)/2+lo;

            if(ar[mid]>=target){
                lb = Math.min(lb,mid);
                hi=mid-1;
            }else lo=mid+1;
        }
        return lb;
    }
    public static int bsUpperBound(int[] ar, int target) {
        int lo=0,hi=ar.length-1;
        int lb = ar.length-1;

        while(lo<=hi){
            int mid = (hi-lo)/2+lo;

            if(ar[mid]>target){
                lb = Math.min(lb,mid);
                hi=mid-1;
            }else lo=mid+1;
        }
        return lb;
    }
}
