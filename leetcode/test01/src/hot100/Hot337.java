package hot100;

import test.FinalTest;
import java.util.HashMap;
import java.util.Map;

public class Hot337 {
    Map<TreeNode,Integer> f = new HashMap<>();
    Map<TreeNode, Integer> g =new HashMap<>();
    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(f.getOrDefault(root,0),g.getOrDefault(root,0));
    }
    public void dfs(TreeNode node){
        if(node == null)return;
        dfs(node.left);
        dfs(node.right);
        f.put(node,node.val + g.getOrDefault(node.left,0) + g.getOrDefault(node.right,0));
        g.put(node,Math.max(f.getOrDefault(node.left,0),g.getOrDefault(node.left,0)) +Math.max(f.getOrDefault(node.right, 0), g.getOrDefault(node.right, 0)));
    }

}
