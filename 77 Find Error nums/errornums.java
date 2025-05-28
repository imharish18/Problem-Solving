public class errornums {
        public static void swap(int[] ar, int i, int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    public static int[] findErrorNums(int[] ar) {
        int n = ar.length;
        int i=0; 

        while(i<n){
            if(ar[i]==i+1 || ar[i]==ar[ar[i]-1]){
                i++;
            }else{
                swap(ar, ar[i]-1, i);
            }
        }
        int missingNo=0;
        int placedNo=0;
        for(int j=0; j<ar.length; j++){
            if(ar[j]!=j+1){
                missingNo = j+1;
                placedNo = ar[j];
            }
        }
        return new int[]{placedNo,missingNo};
    }
}
