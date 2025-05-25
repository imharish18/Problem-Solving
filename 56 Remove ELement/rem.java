import java.util.*;
public class rem {
    public static int removeElement(int[] nums, int val) {
        List<Integer> al = new ArrayList<>();
        int idx = 0;
        for(int i=0; i<nums.length;i++){
            al.add(nums[i]);
            if(al.get(i)!=val){
                nums[idx++] = al.get(i);
            }
        }
        return idx;
    }
}
