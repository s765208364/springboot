package tooffer;

import hot100.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Offer32 {
    public int[] levelOrder(TreeNode root) {
        if(root==null)return new int[0];

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(root);
        result.add(root.val);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if(tmp.left!=null) {
                queue.add(tmp.left);
                result.add(tmp.left.val);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
                result.add(tmp.right.val);
            }

        }
        int[] resultnum = new int[result.size()];
        for(int i=0;i<result.size();i++){
            resultnum[i] = result.get(i);

        }
        return resultnum;
    }

}
