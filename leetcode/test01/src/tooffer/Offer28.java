package tooffer;

import hot100.TreeNode;

public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        return root==null?true:recur(root.left,root.right);
    }
    boolean recur(TreeNode L,TreeNode R){
        if(L==null&&R==null)return true;//同时到叶子节点
        if(L==null||R==null||L.val!=R.val)return false;//一个到叶子节点或者节点值不等
        return recur(L.left,R.right)&&recur(L.right,R.left);//递归判断

    }
}


