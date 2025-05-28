public class iamdupli {
    public static void swap(int[] ar, int i, int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

    public static int findDuplicate(int[] ar) {
        int len = ar.length;
        int i =0;
        while(i!=len){
            int number = ar[i]%len;
            if(number!=i){
                if(ar[i]==ar[ar[i]]) return ar[i];
                swap(ar, number, i);
            } 
            else{
                i++;
            }
        }
        return -1;
    }
}
