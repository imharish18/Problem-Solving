public class iam135 {
        public static int summ(TreeNode root){
        int sum=0;
        if(root==null) return 0;
        sum+=root.val+summ(root.left)+summ(root.right);
        return sum;
    }
}
