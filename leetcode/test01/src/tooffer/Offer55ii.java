package tooffer;

import hot100.TreeNode;

public class Offer55ii {
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        return isBalanced(root.left)&&isBalanced(root.right)&&(Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1);

    }

    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

}
