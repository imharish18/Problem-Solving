public class iam194 {
    private int min = Integer.MAX_VALUE;
    private Integer prev = null;
    public void imharry(TreeNode root){
        if(root==null) return;
        imharry(root.left);
        if(prev!=null) min = Math.min(min,root.val-prev);
        prev = root.val;
        imharry(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        imharry(root);
        return min;
    }
}
