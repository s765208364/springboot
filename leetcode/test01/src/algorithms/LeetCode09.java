package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode09 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<TreeNode>();

        while(root!=null||!stk.empty())
        {
            while(root!=null)
            {
                stk.push(root);
                root=root.left;

            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
