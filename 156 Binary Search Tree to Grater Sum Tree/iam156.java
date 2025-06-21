public class iam156 {
        // MY METHOD 1
    // ArrayList<Integer> al = new ArrayList<>();
    //     public void loader(TreeNode root){
    //     if(root==null) return;
    //     loader(root.left);
    //     al.add(root.val);
    //     loader(root.right);
    // }
    // public void setter(TreeNode root){
    //     if(root==null) return;
    //     setter(root.left);
    //     root.val=al.get(0);
    //     al.remove(0);
    //     setter(root.right);
    // }
    // public TreeNode bstToGst2(TreeNode root) {
    //     loader(root);
    //     for(int i=al.size()-2; i>=0; i--){
    //         al.set(i,al.get(i+1)+al.get(i));
    //     }
    //     setter(root);
    //     return root;
    // }

    private int sum=0;
    public void traverse(TreeNode root){
        if(root==null) return;
        traverse(root.right);
        sum+=root.val;
        root.val=sum;
        traverse(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }
}
