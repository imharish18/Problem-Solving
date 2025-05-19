public class appCr {

    public static void main(String[] args) {
        int[] arr = {112,238,2431,32437,24,492,136,238,221};
        int n = arr.length;
        int[] ans = new int[n];

        ans[n-1] = -1;
        int nge = arr[n-1];
        for(int i=n-2; i>=0; i--){
            ans[i]=nge;
            nge=Math.max(nge, arr[i]);
        }
        nge = arr[n-1];
        int future;
        for(int j=n-2; j>=0; j--){
            future = arr[j];
            arr[j] = nge;
            nge = Math.max(future, nge);
            if(j==0){
                arr[arr.length-1]=-1;
            }
        }
       for(int e: ans){
        System.out.print(e+" ");
       }
       System.out.println();
       for(int e: arr){
        System.out.print(e+" ");
       }
    }
}

