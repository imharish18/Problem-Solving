public class iam151 {
       public static TreeNode helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi){
        TreeNode root = new TreeNode(preorder[prelo]);
        int r=0;
        while(inorder[r]!=preorder[prelo]) r++;
        int leftsize = r-inlo;
        root.left = helper(preorder, inorder, prelo+1, prelo+leftsize, inlo, r-1);
        root.right = helper(preorder, inorder, prelo+leftsize+1, prehi, r+1, inhi);
        return root;
    } 
    public static void buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        helper(preorder, inorder, 0, n-1, 0, n-1);
    } 
}
