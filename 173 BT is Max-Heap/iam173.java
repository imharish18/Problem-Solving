class Node173{
    int val;
    Node173 left;
    Node173 right;
}
public class iam173 {
        public boolean isHeap(Node173 root){
        if(root==null) return true;
        if(root.left!=null){
            if(root.val<root.left.val) return false;
        }
        if(root.right!=null){
            if(root.val<root.right.val) return false;
        }
        return isHeap(root.left) && isHeap(root.right);
    }
    public boolean isCBT(Node173 root, int i, Integer n){
        if(root==null) return true;
        if(i>=n) return false;
        return isCBT(root.left, 2*i+1, n) && isCBT(root.right, i*2+2, n);
    }
}
