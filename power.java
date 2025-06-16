import java.util.ArrayDeque;
import java.util.ArrayList;
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
    public static void preOrderTraversal(TreeNode root, int n){
        if(root==null) return;
        if(n==1) System.out.print(root.val+" ");
        preOrderTraversal(root.left,n++);
        preOrderTraversal(root.right,n++);
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

    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            TreeNode front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
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
