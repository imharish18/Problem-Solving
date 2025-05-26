import java.util.*;
public class sbsetes{
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(nums, 0, result, new ArrayList<>());
        System.out.println(result);

        return result;
    }
    public static void recursion(int[] nums, int idx, List<List<Integer>> result, List<Integer> ans){
        if(idx == nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        recursion(nums, idx+1, result, ans);
        ans.add(nums[idx]);
        recursion(nums, idx+1, result, ans);
        ans.remove(ans.size()-1);
    }

}
