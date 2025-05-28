import java.util.*;

public class ele78 {
        public static void swap(int[] ar, int i, int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    public List<Integer> findDuplicates(int[] ar) {
        int n = ar.length;
        int i=0;
        while(i<n){
            if(ar[i]==i+1 || ar[i]==ar[ar[i]-1]){
                i++;
            }else{
                swap(ar, ar[i]-1, i);
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int j=0; j<n; j++){
            if(ar[j]!=j+1) al.add(0,ar[j]);
        }
        return al;
    }
}
