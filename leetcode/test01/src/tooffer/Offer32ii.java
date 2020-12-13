package tooffer;

import hot100.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer32ii {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(root);
        ArrayList<Integer> tmp = new ArrayList<>();

        while(!queue.isEmpty()){
            tmp.clear();
            for(int i=queue.size();i>0;i--){
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);

            }
            result.add(tmp);
        }

        return result;
    }

}
