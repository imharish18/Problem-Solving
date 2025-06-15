public class iamall136 {
        public static void display(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int summ(TreeNode root){
        if(root==null) return 0;
        return root.val+summ(root.left)+summ(root.right);
    }
    public static int product(TreeNode root){
        if(root==null) return 1;
        return (root.val==0?1:root.val)*product(root.left)*product(root.right);
    }
    public static int max(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    public static int min(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
    public static int sizee(TreeNode root){
        if(root == null) return 0;
        return 1+sizee(root.left) + sizee(root.right);
    }
    public static int levels(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static int height(TreeNode root){
        return levels(root)-1;
    }
}
