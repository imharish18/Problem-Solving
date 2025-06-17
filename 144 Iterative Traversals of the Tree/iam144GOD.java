import java.util.Stack;
public class iam144GOD {
        public static void preOrderTraversal(TreeNode root){
        Stack<TreeNode> st = new Stack();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode topNode = st.pop();
            System.out.print(topNode.val+" ");
            if(topNode.right!=null) st.push(topNode.right);
            if(topNode.left!=null) st.push(topNode.left);
        }
    }
    public static void inOrderTraversal(TreeNode root){
        TreeNode temp = root;
        Stack<TreeNode> st = new Stack<>();
        boolean flag = true;
        while(flag){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }else{
                if(st.isEmpty()){
                    flag = false;
                    break;
                }
                TreeNode node = st.pop();
                System.out.print(node.val+" ");
                temp = node.right;
            }

        }
    }
    public static void postOrderTraversal(TreeNode root){
        Stack<TreeNode> st = new Stack();
        Stack<Integer> ans = new Stack();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode topNode = st.pop();
            ans.push(topNode.val);
            if(topNode.left!=null) st.push(topNode.left);
            if(topNode.right!=null) st.push(topNode.right);
        }
        while (!ans.isEmpty()) {
            System.out.print(ans.pop()+" ");
        }
    }
}
