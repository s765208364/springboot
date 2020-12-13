package tooffer;

import hot100.TreeNode;

public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode root){
        if(root==null)return;
        dfs(root.left);
        dfs(root.right);
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

    }

}
