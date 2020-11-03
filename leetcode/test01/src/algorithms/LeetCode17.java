package algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode17 {
    Stack<TreeNode> stk = new Stack<>();
    public void flatten(TreeNode root) {
    List<TreeNode> list = new LinkedList<>();

    TreeNode node = root;
    while(node!=null||!stk.isEmpty())
    {
        while(node!=null)
        {
            list.add(node);
            stk.push(node);
            node = node.left;
        }

        node = stk.pop();
        node = node.right;

    }

        dfs(root);
        TreeNode pre = stk.pop();
        TreeNode last;
        while(!stk.isEmpty()) {
            last = stk.pop();
            last.right = pre;
            pre = last;
        }

    }
    void dfs(TreeNode root) {
        if(root==null) {
            return;
        }
        stk.push(root);
        dfs(root.left);
        dfs(root.right);

    }

}
