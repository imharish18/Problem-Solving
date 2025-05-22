class searchInRoatated{
    public static int searchIn(int[] ar, int target) {
        int n = ar.length;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(ar[mid]==target) return mid;
            else if(ar[mid]<=ar[n-1]){
                if(target>=ar[mid] && target<=ar[hi]) lo=mid+1;
                else hi = mid-1;
            }
            else{
                if(target>=ar[lo] && target<=ar[mid]) hi=mid-1;
                else lo = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] ar = {3,4,5,6,7,0,1,2};
        System.out.println(searchIn(ar,3));
    }
}