
public class iamsymmetric {

    public static TreeNode invert(TreeNode root){
        if(root==null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        if(!isSameTree(p.left, q.left)) return false;
        if(!isSameTree(p.right, q.right)) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        invert(root.right);
        return isSameTree(root.left,root.right);
    }
}
