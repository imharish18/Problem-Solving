public class iam155 {
    class Solution {
    private Integer lastValue = null;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(!isValidBST(root.left)) return false;
        if(lastValue!=null && lastValue>=root.val) return false;
        lastValue = root.val;
        if(!isValidBST(root.right)) return false;
        return true;
    }

    // My method TWO :)
    // public int getMinimum(TreeNode root) {
    //     if (root == null) return Integer.MAX_VALUE;
    //     int leftMin = getMinimum(root.left);
    //     int rightMin = getMinimum(root.right);
    //     return Math.min(root.val, Math.min(leftMin, rightMin));
    // }
    // public int getMaximum(TreeNode root) {
    //     if (root == null) return Integer.MIN_VALUE;
    //     int leftMax = getMaximum(root.left);
    //     int rightMax = getMaximum(root.right);
    //     return Math.max(root.val, Math.max(leftMax, rightMax));
    // }
 
    // public boolean isValidBST(TreeNode root) {
    //     if(root==null) return true;
    //     int leftValue = getMaximum(root.left);
    //     int rightValue = getMinimum(root.right);
    //     if(root.left!=null && leftValue>=root.val) return false;
    //     if(root.right!=null && rightValue<=root.val) return false;
    //     return isValidBST(root.left) && isValidBST(root.right);
    // }
}
}
