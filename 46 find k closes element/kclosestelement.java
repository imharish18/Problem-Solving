import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class kclosestelement{
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

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;

        if(arr[0]>x){
            for(int i =0; i<k; i++){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }

        if(x>arr[n-1]){
            for(int i=n-1; i>=n-k; i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }

        int lb = bsLowerBound(arr, x);
        int i=lb-1, j = lb;

        while(k>0 && i>=0 && j<n){
            int di = Math.abs(x-arr[i]);
            int dj = Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
                k--;
            }else{
                ans.add(arr[j]);
                j++;
                k--;
            }
        }
        while(i<0 && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }
        while(j==n && k>0){
            ans.add(arr[i]);
            i++;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args){
        int[] ar = {-2,-1,1,2,3,4,5};
        int k = 7;
        int x = 3;
        System.out.println(findClosestElements(ar,k,x));

    }
}