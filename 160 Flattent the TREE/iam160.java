public class iam160{
    //Method 111111
    // public void pre(TreeNode root, List<TreeNode> pre){
    //     if(root==null) return;
    //     pre.add(root);
    //     pre(root.left, pre);
    //     pre(root.right, pre);
    // }
    // public void flatten(TreeNode root) {
    //     List<TreeNode> al = new ArrayList<>();
    //     pre(root, al);
    //     int n = al.size();
    //     for(int i=0; i<n; i++){
    //         if(i!=n-1) al.get(i).right = al.get(i+1);
    //         al.get(i).left=null;
    //     }
    // }

    public void flatten(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return;
        
        TreeNode lst = root.left;
        TreeNode rst = root.right;

        flatten(lst);
        flatten(rst);

        root.left = null;
        root.right = lst;

        TreeNode temp = root;
        while (temp.right != null) temp = temp.right;

        temp.right = rst;
    }
    public void MorrisTraversal(TreeNode root) {
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode r = curr.right;
                curr.right = curr.left;
                TreeNode p = curr.left;
                while(p.right!=null) p=p.right;
                p.right=r;
                curr.left=null;
                curr=curr.right;
            }else curr = curr.right;
        }
    }
}