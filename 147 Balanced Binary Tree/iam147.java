
public class iam147 {
    static boolean ans;
    public int isB(TreeNode root){
        if(root == null) return 0;
        if(ans==false) return 0;
        int left = isB(root.left);
        int right = isB(root.right);
        int diff = Math.abs(left-right);
        if(diff>1) ans = false;
        return 1 + Math.max(left,right);
    }

    public boolean isBalanced(TreeNode root) {
        ans = true;
        isB(root);
        return ans;
    }
}