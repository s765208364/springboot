package algorithms;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            Deque<Integer> levelList = new LinkedList<>();
            int size = queue.size();
            for(int i = 0;i < size;i++){
                TreeNode curNode = queue.poll();
                if(flag){
                    levelList.offerLast(curNode.val);
                }else{
                    levelList.offerFirst(curNode.val);
                }
                if(curNode.left != null){
                    queue.offer(curNode.left);
                }
                if(curNode.right != null){
                    queue.offer(curNode.right);
                }
            }
            ans.add(new LinkedList<Integer>(levelList));
            flag = !flag;
        }
        return ans;
    }

}
