public class iam173 {
        public boolean isHeap(Node root){
        if(root==null) return true;
        if(root.left!=null){
            if(root.val<root.left.val) return false;
        }
        if(root.right!=null){
            if(root.val<root.right.val) return false;
        }
        return isHeap(root.left) && isHeap(root.right);
    }
    public boolean isCBT(Node root, int i, Integer n){
        if(root==null) return true;
        if(i>=n) return false;
        return isCBT(root.left, 2*i+1, n) && isCBT(root.right, i*2+2, n);
    }
}
