import java.util.Arrays;

public class app {
    public static boolean bSearch(int[] ar, int target) {
        int n = ar.length;
        int lo=0,hi=n-1;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(ar[mid]==target){
                return true;
            }
            if(ar[mid]>target){
                hi=mid-1;
                
            }else{
                lo=mid+1;
            }

        }
        return false;
    }
    public static int bsLowerBound(int[] ar, int target) {
        int lo=0,hi=ar.length-1,n=ar.length;
        int lb = n;

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
        int lb = ar.length;

        while(lo<=hi){
            int mid = (hi-lo)/2+lo;

            if(ar[mid]>target){
                lb = Math.min(lb,mid);
                hi=mid-1;
            }else lo=mid+1;
        }
        return lb;
    }

    public static void main(String[] args) {
        int[] ar = {0,5,20,16,1300};

        for(int e : ar){
            System.out.print(e+" ");
        }

        System.out.println("\n------------------------------");

        boolean bs = bSearch(ar, 0);
        int lb = bsLowerBound(ar, 0);
        int ub = bsUpperBound(ar, 0);
        System.out.println(lb+" "+ub);
        if(bs){
            System.out.println(Math.max((lb+1)-ub, ar.length- (ub)-lb));
        }else{
            System.out.println(Math.max(lb,ub));
        }

    }  

}

