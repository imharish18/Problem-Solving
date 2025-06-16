import java.util.Queue;
import java.util.ArrayDeque;
public class iam141 {
        public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            TreeNode front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
    }
}
