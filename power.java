import java.util.*;

class power{
    public static void negNo(int[] ar, int k) {
        int n = ar.length;
        int i = k, j = k;

        int p = 0;
        int max = 0;

        int[] ans = new int[n];

        for(int x=1; x<k; x++){
            if(ar[x]>ar[max]) max = x;
        }
        for(int x=0; x<max; x++){
            ans[p]=ar[max];
            p++;
        }

        while(j<n){
            if(ar[j]<ar[max]){
                ans[p]=ar[max];
                p++;
                System.out.println(ar[j]+" and " +ar[max]);
            }else{
                System.out.println(ar[j]+" and " +ar[max]);
                max=j;
                ans[p] = ar[max];
                p++;
            }
            j++;
            i++;
        }
        for(int a : ans){
            System.out.print(a+" ");
        }

    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        negNo(nums, 3);

    }
}