package algorithms;

public class LeetCode20 {
        public TreeNode invertTree(TreeNode root) {
            dfs(root);
            return root;
        }
        void dfs(TreeNode root)
        {
            if(root==null)return;
            TreeNode temp = root.right;

            root.right = root.left;
            root.left = temp;
            dfs(root.left);
            dfs(root.right);


        }

}
