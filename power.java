import java.util.*;

public class power {

    public static int maxOperations(int[] nums, int k) {
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x : map.keySet()){
            if(map.get(x)==1) map.remove(x);
            else map.put(x,map.getOrDefault(x,0)-1);
            if(map.containsKey(k-x) && map.get(k-x)>0){
                count++;
            map.put(x,map.getOrDefault(x,0)-1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
    }
}
