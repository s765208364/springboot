package algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode16 {
    private Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;

        for(int i=0;i<n;i++)
        {
            map.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,n-1,0,n-1);

    }

    TreeNode helper(int[] preorder, int[] inorder,int preorder_left,int preorder_right,int inorder_left,int inorder_right)
    {
        if(preorder_left>preorder_right)return null;

        int preorder_root =  preorder_left;
        TreeNode root = new TreeNode(preorder[preorder_root]);

        int inorder_root = map.get(preorder[preorder_root]);

        int size_left_subtree = inorder_root - inorder_left;

        root.left = helper(preorder,inorder,preorder_left+1,preorder_left+size_left_subtree,inorder_left,inorder_root-1);
        root.right = helper(preorder,inorder,preorder_left+size_left_subtree+1,preorder_right,inorder_root+1,inorder_right);

        return root;

    }

}
