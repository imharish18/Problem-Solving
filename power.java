import java.util.ArrayDeque;
import java.util.Stack;
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
        Stack<TreeNode> st = new Stack();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode topNode = st.pop();
            System.out.print(topNode.val+" ");
            if(topNode.right!=null) st.push(topNode.right);
            if(topNode.left!=null) st.push(topNode.left);
        }
    }
    public static void postOrderTraversal(TreeNode root){
        Stack<TreeNode> st = new Stack();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode topNode = st.pop();
            System.out.print(topNode.val+" ");
            if(topNode.left!=null) st.push(topNode.left);
            if(topNode.right!=null) st.push(topNode.right);


        }
    }


    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2); 
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left=b; a.right = c;
        b.left = d; b.right=e;
        c.left=f; c.right=g;

        preOrderTraversal(a);
        System.out.println();
        postOrderTraversal(a);

    }
}
