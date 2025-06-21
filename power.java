import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;
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
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);

        ArrayList<Integer> pre = new ArrayList<>(al);
        for(int i=1; i<al.size(); i++){
            al.set(i,al.get(i-1)+al.get(i));
        }
        for(int i=al.size()-2; i>=0; i--){
            pre.set(i,pre.get(i+1)+pre.get(i));
        }

        System.out.println(pre);
        System.out.println(al.remove(0));
        System.out.println(pre);
        System.out.println(pre);
        System.out.println(pre);
        System.out.println(pre);
        System.out.println(pre);
        System.out.println(pre);
    }
}
