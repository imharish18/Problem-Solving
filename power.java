import java.util.ArrayDeque;
import java.util.ArrayList;
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
    public static void inOrderTraversal(TreeNode root){
        TreeNode temp = root;
        Stack<TreeNode> st = new Stack<>();
        boolean flag = true;
        while(flag){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }else{
                if(st.isEmpty()){
                    flag = false;
                    break;
                }
                TreeNode node = st.pop();
                System.out.print(node.val+" ");
                temp = node.right;
            }

        }
    }
    public static void postOrderTraversal(TreeNode root){
        Stack<TreeNode> st = new Stack();
        Stack<Integer> ans = new Stack();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode topNode = st.pop();
            ans.push(topNode.val);
            if(topNode.left!=null) st.push(topNode.left);
            if(topNode.right!=null) st.push(topNode.right);
        }
        while (!ans.isEmpty()) {
            System.out.print(ans.pop()+" ");
        }
    }


    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] parts = path.split("/");
        for(String s : parts){
            if(s.equals("") || s.equals(".")) continue;
            else if(s.equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(s);
        }
            while (!st.isEmpty()) {
        sb.insert(0, "/" + st.pop());
    }
        System.out.println(sb);
        return sb.reverse().toString();
    }

    public static int level(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public static void dfs(TreeNode root, int level, List<Integer> al){
        if(root==null) return;
        al.set(level,root.val);
        dfs(root.left,level+1,al);
        dfs(root.right,level+1,al);
    }

    public static TreeNode helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi){
        TreeNode root = new TreeNode(preorder[prelo]);
        int r=0;
        while(inorder[r]!=preorder[prelo]) r++;
        int leftsize = r-inlo;
        root.left = helper(preorder, inorder, prelo+1, prelo+leftsize, inlo, r-1);
        root.right = helper(preorder, inorder, prelo+leftsize+1, prehi, r+1, inhi);
        return root;
    } 
    public static void buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        helper(preorder, inorder, 0, n-1, 0, n-1);
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
        ArrayList<Integer> al = new ArrayList<>();
        dfs(a,0,al);
        System.out.println(al);
    }
}
