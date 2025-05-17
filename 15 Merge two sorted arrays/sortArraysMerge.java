import java.util.Arrays;

public class sortArraysMerge {

    public static void main(String[] args) {
       int[] arr1 = {0,9,13,44,45};
       int[] arr2 = {3,7,9,21,42,48,55,66,77,88};
       int[] res = join15(arr1, arr2);
       for(int e: res){
        System.out.print(e+" ");
       }
    }
    public static int[] join15(int[] a, int[] b) {
        int n = a.length;
        int i = 0;
        int m = b.length;
        int j = 0;
        int k = 0;
        int[] res = new int[m+n];
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                res[k]=a[i];
                i++;
            }else{
                res[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){
            while(j<b.length){
                res[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                res[k]=a[i];
                i++;
                k++;
            }
        }
        
        return res;
    }
}

