public class iam157 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
            if(root.left == null && root.right==null) return null;
            else if(root.left==null || root.right==null){
                if(root.left==null) return root.right;
                else return root.left;
            }
            else{
                TreeNode p = root.left;
                TreeNode pp = root;
                while(p.right!=null){
                    pp=p;
                    p=p.right;
                }
                if(p==root.left && pp==root) pp.left = p.left;
                else pp.right = p.left;
                p.left = root.left;
                p.right = root.right;
                return p;
            }

        }else if(root.val>key) root.left = deleteNode(root.left,key);
        else root.right = deleteNode(root.right,key);
        return root;
    }
}

