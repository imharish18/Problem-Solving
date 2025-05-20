public class bsortt33 {
    public static void swap(int ar[], int i, int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    public static void bubbleSort(int[] ar) {
       int n = ar.length;
       for(int i=0; i<n-1; i++){
        int flag = 0;
        for(int j=0; j<ar.length-1-i; j++){
            if(ar[j]>ar[j+1]){
                swap(ar,j,j+1);
            }else flag++;
        }
        if(flag==n-i-1) break;
        }
    }
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        bubbleSort(ar);
        for(int e: ar){
            System.out.print(e+" ");
        }
    }   
}
