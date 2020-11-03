package algorithms;

import java.util.LinkedList;
import java.util.List;

public class LeetCode12 {

    public boolean isSymmetric(TreeNode root)
    {
        return check(root,root);

    }

    boolean check(TreeNode left,TreeNode right)
    {
        if(left==null&&right==null)return true;

        if(left==null||right==null)return false;

        return left.val==right.val&&check(left.left,left.right)&&check(right.left,right.right);
    }
}
