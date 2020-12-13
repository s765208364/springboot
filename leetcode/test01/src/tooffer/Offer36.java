package tooffer;

public class Offer36 {
    Node pre,head;//遍历到最后一个节点时，节点pre为尾节点
    public Node treeToDoublyList(Node root) {
        if(root==null)return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    void dfs(Node cur){
        if(cur==null)return;

        dfs(cur.left);
        if(pre!=null)pre.right = cur;
        else head=cur;
        cur.left=pre;
        pre=cur;
        dfs(cur.right);
    }
}
