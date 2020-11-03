package algorithms;

public class LeetCode29 {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root){
        if(root==null)return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        max = Math.max(left+right,max);
        return Math.max(left,right)+1;
    }

}
