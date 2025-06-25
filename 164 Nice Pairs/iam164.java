import java.util.*;
public class iam164 {
    public int revAlgo(int x){
        int rev = 0;
        int t = x;
        while(t>0){
            rev=rev*10+t%10;
            t/=10;
        }
        return x-rev;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int x : nums){
            int key = revAlgo(x);
            if(map.containsKey(key)){
                int val = map.get(key);
                count+=val;
                count%=1000000007;
                map.put(key,val+1);
            }else map.put(key,1);
            
        }
        return count;
    }
}

