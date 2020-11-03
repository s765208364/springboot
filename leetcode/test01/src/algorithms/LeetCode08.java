package algorithms;

import java.util.LinkedList;
import java.util.List;

public class LeetCode08 {

    List<Integer> result = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return result;
    }

    void dfs(TreeNode root)
    {
        if(root==null)return;
        dfs(root.left);
        result.add(root.val);
        dfs(root.right);

    }
}
