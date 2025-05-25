public class searchInsert57 {
        public static int searchInsert(int[] ar, int target) {
        int lo=0,n=ar.length,hi=n-1;
        if(ar[lo]>target) return 0;
        if(ar[hi]<target) return hi;
        while(lo<=hi){  
            int mid = lo + (hi-lo)/2;
            if(ar[mid]==target) return mid;
            else if(ar[mid]>target){
                if(ar[mid-1]<target)return mid;
                else hi=mid-1;
            }
            else if(ar[mid]<target){
                if(ar[mid+1]>target) return mid+1;
                else lo=mid+1;    
            }
        }
        return -1;
    }
}
