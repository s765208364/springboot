package algorithms;

public class LeetCode14 {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else
        {
            int lefthight = maxDepth(root.left);
            int righthight = maxDepth(root.right);

            return Math.max(lefthight,righthight) + 1;
        }

    }
}
