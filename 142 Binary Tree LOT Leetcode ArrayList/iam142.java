import java.util.*;
public class iam142 {
    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node=node;
            this.level=level;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Pair> q = new ArrayDeque<>();
        int level = 0;

        if(root!=null) q.add(new Pair(root,level));
        while(q.size()>0){
            Pair front = q.remove();
            if(front.level!=level){
                level++;
                ans.add(new ArrayList<>(al));
                al.clear();
            }
            al.add(front.node.val);
            if(front.node.left!=null) q.add(new Pair(front.node.left, level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right, level+1));
        }
        if(!al.isEmpty()) ans.add(al);
        return ans;
    }
}
