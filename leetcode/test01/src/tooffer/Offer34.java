package tooffer;

import hot100.TreeNode;
import test.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer34 {
    List<List<Integer>> res= new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root,sum);
        return res;
    }

    public void recur(TreeNode root,int tar){
        if(root==null)return;
        path.add(root.val);
        tar-=root.val;

      //  path.addLast();
        if(tar==0&&root.left==null&&root.right==null)
            res.add(new LinkedList<>(path));

        recur(root.left,tar);
        recur(root.right,tar);
        path.removeLast();

    }




}