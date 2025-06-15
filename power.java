
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
    public static void display(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int summ(TreeNode root){
        int sum=0;
        if(root==null) return 0;
        sum+=root.val+summ(root.left)+summ(root.right);
        return sum;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(4); 
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(1);

        a.left=b; a.right = c;
        b.left = d; b.right=e;
        c.right=f; c.left=g;
        System.out.println(summ(a));
    }
}
