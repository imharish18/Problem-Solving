import java.util.ArrayList;
import java.util.List;

class sbsets{
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(nums, 0, result, new ArrayList<>());
        System.out.println(result);

        return result;
    }
    public static void recursion(int[] nums, int idx, List<List<Integer>> result, List<Integer> ans){
        if(idx == nums.length || ans.size()==4){
            if(ans.size()==4 && ans.get(0)==1) result.add(new ArrayList<>(ans));
            return;
        }
        recursion(nums, idx+1, result, ans);
        ans.add(nums[idx]);
        recursion(nums, idx+1, result, ans);
        ans.remove(ans.size()-1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        subsets(arr);
    }
} 
