class firstandlastIndex {
    public static boolean bsear(int[] ar, int target){ 
        int n = ar.length;
        int lo=0, hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(ar[mid]==target) return true;
            if(ar[mid]<target){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return false;
    }
    public static int lowe(int[] ar, int target){
        int n = ar.length;
        int lo=0, hi = n-1;
        int lb = n;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(ar[mid]>=target){
                lb = Math.min(lb,mid);
                hi = mid - 1;
            }else lo = mid+1;
        }
        return lb;
    }
    public static int uppe(int[] ar, int target){
        int n = ar.length;
        int lo=0, hi = n-1;
        int up = n;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(ar[mid]>target){
                up = Math.min(up, mid);
                hi = mid -1;
            }else{
                lo = mid+1;
            }
        }
        return up;
    }
    public static void main(String[] args){
        int[] ar = {5,7,7,8,8,10};
        int target = 8;
        if(bsear(ar, target)){
            int lb = lowe(ar, target);
            int up = uppe(ar, target)-1;
            System.out.println(lb+" "+up);
        }
    }
}