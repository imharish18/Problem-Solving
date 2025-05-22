class fnl {
    public static int[] bsear(int[] ar, int target){ 
        int n = ar.length;
        int lo=0, hi = n-1;
        int lp = -1;
        int[] ans = {-1,-1};
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(ar[mid]==target){
                if(ar[mid-1]==ar[mid]){
                    hi = mid - 1;
                }else{
                    lp = mid;
                    break;
                }
            }
            else if(ar[mid]<target){lo=mid+1;}
            else{hi=mid-1;}
        }
        lo = 0; hi = n-1;
        int hp = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(ar[mid]==target){
                if(mid+1<n && ar[mid+1]==ar[mid]){
                    lo = mid + 1;
                }else{
                    hp = mid; break;
                }
            }
            else if(ar[mid]<target){lo=mid+1;}
            else{hi=mid-1;}
        }
        ans[0] = lp;
        ans[1] = hp;
        return ans;
    }

    public static void main(String[] args){
        int[] ar = {5,7,8,8,8,10};
        int target = 8;
        int[] a = bsear(ar, target);
        for(int e : a){
            System.out.print(e+" ");
        }
    }
}