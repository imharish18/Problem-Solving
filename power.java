import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

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
        public static String[] divideString2(String s, int k, char fill) {
            int n = s.length();
            while(s.length()%k!=0) s=s+fill;
            int parts = (n + k - 1) / k;           
            String[] ans = new String[parts];
            StringBuilder sb = new StringBuilder(s);
            for(i=0; i<n; i=i+k){
                ans[i/k] = sb.substring(i,i+k);
            }
            for(String ss:ans){
                System.out.print(ss+" ");
            }
            return ans;
        }
    public static String[] divideString(String s, int k, char fill) {
            int n = s.length();
            while(s.length()%k!=0) s=s+fill;
            int parts = (n + k - 1) / k;
            String[] ans = new String[parts];
            StringBuilder sb = new StringBuilder(s);
            int i;
            for(i=0; i<n/k; i++){
                ans[i%k] = sb.substring(i,i+k);
            }
            System.out.println(i);

            for(String ss:ans){
                System.out.print(ss+" ");
            }
            int iterator= i*k;
            while(iterator<parts){
                if(iterator<n) ans[i]=ans[i]+s.charAt(i);
                else ans[i]=ans[i]+fill;
                iterator++;
            }
            for(String ss:ans){
                System.out.print(ss+" ");
            }
            
            return ans;
    }
    List<ArrayList<Integer>> al = new ArrayList<>();
    public static void addToList(TreeNode root, int lo, int hi){
        if(root==null) return;
        addToList(root.left, lo, hi);

        addToList(root.right, lo, hi);

    }
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
    public static void kthSmallMorris(TreeNode root, int k){
        int iterator = 0;
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode p = curr.left;
                while(p.right!=null && p.right!=curr) p=p.right;
                if(p.right==null){
                    p.right=curr;
                    curr=curr.left;
                }else{
                    if(iterator==k){
                        System.out.println(curr.val);
                        return;
                    }
                    iterator++;
                    curr=curr.right;
                    p.right=null;
                }
            }else{
                if(iterator==k){
                    System.out.println(curr.val);
                    return;
                }
                iterator++;
                curr=curr.right;
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(8);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(4);
        TreeNode d2 = new TreeNode(3);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(9);
        TreeNode e2 = new TreeNode(7);
        root.left = a; root.right=b;
        a.left=c;a.right=d; d.left=d2;
        b.left=e;b.right=f; e.right=e2;

        kthSmallMorris(root,6);

    }
}
