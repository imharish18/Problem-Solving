import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.event.InternalFrameAdapter;

import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class power {
    static int i=0;
    public static void inorder(TreeNode root, int[] ar){
        if(root==null) return;
        inorder(root.left,ar);
        ar[i++] = root.val;
        inorder(root.right,ar);
    }

    public static int helper(int[] ar, int key, int lo, int hi){
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (ar[mid] == key) return mid;
            if (ar[mid] > key) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        TreeNode a = new TreeNode(30);
        TreeNode b = new TreeNode(70);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(40);
        TreeNode e = new TreeNode(60);
        TreeNode f = new TreeNode(80);
        root.left = a; root.right=b;
        a.left=c;a.right=d;
        b.left=e;b.right=f;

        inPred
    }
}
