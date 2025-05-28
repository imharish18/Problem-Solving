public class fmp {
    public static void swap(int[] ar, int i, int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

    public static int firstMissingPositive(int[] ar) {
        int n = ar.length; 
        int i=0; 
        while(i<n){
            if(ar[i]==i+1 || ar[i]<=0 || ar[i]>n || ar[i]==ar[ar[i]-1]) i++;
            else swap(ar, ar[i]-1,i);
        }
        for(i=0; i<n; i++){
            if(ar[i]!=i+1) return i+1;
        }
        return i;
    }
}
