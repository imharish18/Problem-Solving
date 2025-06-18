public class iam148 {
    static int diameter;
    public int height(TreeNode root){
        if(root==null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        diameter = Math.max(diameter,l+r);
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        if(root==null) return 0;
        height(root);
        return diameter;
    }
}
