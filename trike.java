public class trike{
    static int doo = 1;
    public static void swap(int[] ar, int i, int j){
        try {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j]=temp;
        } catch (Exception e) {
            doo=0;
        }

    }
    public static int missingNo(int[] ar){
        int n = ar.length;
        int i=0;
            while(i!=n){
                if(ar[i]==n) i++;
                else if(ar[i]!=i){
                    swap(ar, ar[i], i);
                }else i++;
            }
            for(int j=0; j<n; j++){
                if(ar[j]!=j) return j;
            }
            return n;
    }
    
    public static void main(String[] args) {
        int[] ar = {0,1,3,4,5};
        missingNo(ar);
        for(int e : ar){
            System.out.print(e+" ");
        }
    }
}