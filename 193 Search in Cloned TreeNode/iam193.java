public class iam193 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) return null;  
        
        if (original == target) return cloned; 

        TreeNode leftResult = getTargetCopy(original.left, cloned.left, target);
        if (leftResult != null) return leftResult;

        return getTargetCopy(original.right, cloned.right, target);
    }
}

