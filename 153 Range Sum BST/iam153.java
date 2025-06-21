public class iam153 {
    public int rangeSumBST(TreeNode root, int lo, int hi) {
        if(root==null) return 0;
        int sum = 0;
        if (root.val >= lo && root.val <= hi){
            sum += root.val;
            sum += rangeSumBST(root.left, lo, hi);
            sum += rangeSumBST(root.right, lo, hi);
        }
        else if(root.val>hi) sum += rangeSumBST(root.left, lo, hi);
        else sum += rangeSumBST(root.right, lo, hi);
        return sum;

    }
}

