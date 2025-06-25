import java.util.*;

public class power {

    public static boolean canArrange(int[] ar, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : ar){
            int rem = x%k;
            if(rem<0) rem+=k;
            map.put(x,map.getOrDefault(x,0)+1);
        }
        if(map.containsKey(0)){
            if(map.get(0)%2!=0) return false;
            map.remove(0);
        }
        for(int key : map.keySet()){
            int rem = k - key;
            if(!map.containsKey(rem)) return false;
            int keyFreq = map.get(key);
            int remFreq = map.get(rem);
            if(keyFreq!=remFreq) return false;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
