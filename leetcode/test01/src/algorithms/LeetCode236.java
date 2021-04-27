package algorithms;

public class LeetCode236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root)
            return root;

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left == null && right ==null) return null;
        if(left ==null && right != null) return right;
        if(left !=null && right == null) return left;
        return root;
    }
}
