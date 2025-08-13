public class iam191 {

    long firstMin = Long.MAX_VALUE;
    long secondMin = Long.MAX_VALUE;

    public void dfs(TreeNode root) {
        if (root == null) return;

        if (root.val < firstMin) {
            secondMin = firstMin;
            firstMin = root.val;
        } else if (root.val > firstMin && root.val < secondMin) {
            secondMin = root.val;
        }

        dfs(root.left);
        dfs(root.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        return (secondMin == Long.MAX_VALUE) ? -1 : (int) secondMin;
    }
}
