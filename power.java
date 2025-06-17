import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class power {
    public static void preOrderTraversal(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void preOrderTraversal(TreeNode root, int count, int level, List<Integer> al){
        if(root==null) return;
        if(count==level) al.add(root.val);
        preOrderTraversal(root.right,count+1,level, al);
        preOrderTraversal(root.left,count+1,level, al);
    }
    public static void inOrderTraversal(TreeNode root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    public static void postOrderTraversal(TreeNode root){
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
        
    }


    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node, int level){
            this.node=node;
            this.level=level;
        }
    }

    public static void levelOrderTraversal(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Pair> q = new ArrayDeque<>();
        int level = 0;

        if(root!=null) q.add(new Pair(root,level));
        while(q.size()>0){
            Pair front = q.remove();
            if(front.level!=level){
                level++;
                System.out.println(al);
                ans.add(new ArrayList<>(al));
                System.out.println(ans);
                al.clear();
            }
            al.add(front.node.val);
            if(front.node.left!=null) q.add(new Pair(front.node.left, level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right, level+1));
        }
        System.out.println(al);
        ans.add(ans.size()-1,al);
        System.out.println(ans);
        // System.out.println(ans);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(2); 
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(9);
        a.left=b; a.right = c;
        b.left = d; b.right=e;
        c.left=f; c.right=g;

        levelOrderTraversal(a);



    }
}
