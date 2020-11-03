package algorithms;

import java.util.LinkedList;
import java.util.List;

public class LeetCode11 {

    List<Integer> list= new LinkedList<Integer>();

    public boolean isValidBST(TreeNode root) {
        dfs(root);
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>list.get(i+1))
                return false;

        }
        return true;

    }

    void dfs(TreeNode root)
    {
        if(root==null)return;

        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
