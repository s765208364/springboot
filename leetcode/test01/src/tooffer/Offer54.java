package tooffer;

import hot100.TreeNode;

public class Offer54 {
    int result;
    public int kthLargest(TreeNode root, int k) {
        dfs(root,k);
        return result;

    }
    public void dfs(TreeNode root,int k){
        if(root==null||k==0)return;
        dfs(root.right,k);

        k=k-1;
        if(k==0)
        result = root.val;

        dfs(root.left,k);
    }

}
