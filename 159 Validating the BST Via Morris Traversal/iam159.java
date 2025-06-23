public class iam159 {
    public boolean isValidBST(TreeNode root){
        TreeNode curr = root;
        Long prev = Long.MIN_VALUE;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode p = curr.left;
                while(p.right!=null && p.right!=curr) p=p.right;
                if(p.right==null){
                    p.right=curr;
                    curr=curr.left;
                }else{
                    if(prev>=curr.val) return false;
                    prev=(long)curr.val;
                    curr=curr.right;
                    p.right=null;
                }
            }else{
                if(prev>=curr.val) return false;
                prev=(long)curr.val;
                curr=curr.right;
            }
        }
        return true;
    }
}
