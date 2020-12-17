package tooffer;

import hot100.TreeNode;

public class Offer55i {
    
    int max=1;
    public int maxDepth(TreeNode root) {
        dfs(root,0);
        return max;
    }
    void dfs(TreeNode root,int height){
        if(root==null)return;
        height++;
        dfs(root.left,height);
        dfs(root.right,height);
        if(height>max)max = height;

    }
}
