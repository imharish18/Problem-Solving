import java.util.*;
public class iam178 {
    public int totalFruit(int[] ar) {
        int n = ar.length, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0, j=0;
        while(j<n){
            map.put(ar[j],map.getOrDefault(ar[j],0)+1);
            while(map.size()>2){
                map.put(ar[i],map.getOrDefault(ar[i],0)-1);
                if(map.get(ar[i])==0) map.remove(ar[i]);
                i++;
            }
            if(j-i+1>maxLen) maxLen = j-i+1;
            j++;
        }
    return maxLen;
    }
}