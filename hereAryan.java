import java.util.*;
import java.util.Stack;

public class hereAryan {
    public static void work(int[] ar){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(ar);
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            if(i>0 && ar[i]==ar[i-1]) continue;
            int j = i+1;
            int k = n-1;

            while(j<k){
                int sum = ar[i]+ar[j]+ar[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    ArrayList<Integer> al = new ArrayList<>(List.of(ar[i], ar[j], ar[k]));
                    ans.add(al);j++;
                    k--;
                    while (j<k && ar[j]==ar[j-1]) j++;
                    while(j<k && ar[k]==ar[k+1]) k--;  
                }         
                
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] ar1 = {-1,0,1,2,-1,4};
        work(ar1);
    }
}
