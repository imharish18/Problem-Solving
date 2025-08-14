public class iam195 {

    private Integer harry = null;
    public boolean imharry(TreeNode root){
        if(root==null) return true;
        if(harry!=null && harry!=root.val) return false;
        harry = root.val;
        boolean left = imharry(root.left);
        boolean right = imharry(root.right);
        return left && right;
    }
    public boolean isUnivalTree(TreeNode root) {
        return imharry(root);
    }
}