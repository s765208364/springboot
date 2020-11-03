package algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode13 {

    List<List<Integer>> list  = new ArrayList<>();

    void helper(TreeNode root,int level)
    {
        if(list.size()==level)
            list.add(new ArrayList<>());
        list.get(level).add(root.val);

        if(root.left!=null)
            helper(root.left,level+1);

        if(root.right!=null)
            helper(root.right,level+1);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)return list;

        helper(root,0);
        return list;
    }

}
