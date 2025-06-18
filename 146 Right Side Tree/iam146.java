import java.util.*;
public class iam146 {
    public int level(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public void dfs(TreeNode root, int level, List<Integer> al){
        if(root==null) return;
        al.set(level,root.val);
        dfs(root.left,level+1,al);
        dfs(root.right,level+1,al);
    }
    public List<Integer> rightSideView(TreeNode root) {
        int h = level(root);
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(h, 0));
        dfs(root,0,ans);
        return ans;
    }
}
