public class iam158 {
        public static void visit(TreeNode root){
        System.out.print(root.val+" ");
    }
    public static void predi(TreeNode root){
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode p = curr.left;
                while(p.right!=null && p.right!=curr) p=p.right;
                if(p.right==null){
                    p.right=curr;
                    curr=curr.left;
                }else{
                    visit(curr);
                    curr=curr.right;
                    p.right=null;
                }
            }else{
                visit(curr);
                curr=curr.right;
            }
        }
    }
}
