import java.util.*;
public class multimiss {
        public static void swap(int[] ar, int i, int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

    public static List<Integer> findDisappearedNumbers(int[] ar) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = ar.length;
        int i=0;
        while(i<n){
            if(ar[i]==i+1 || ar[ar[i]-1]==ar[i]) i++;
            else swap(ar, ar[i]-1, i);;
        }
        for(int j=0; j<n; j++){
            if(ar[j]!=j+1) al.add(j+1);
        }
        return al;
    }
}
