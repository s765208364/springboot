package test;

import java.util.LinkedList;

public class Tree {

    //中序遍历二叉树  非递归
    public void inOrder(Node root){
        Node current = root;
        LinkedList<Node> s = new LinkedList<Node>();

        while(current!=null||!s.isEmpty()){
            //先找到最左边的节点
            while(current !=null){
                s.addFirst(current);
                current = current.left;
            }

            if(!s.isEmpty()){
                current = s.removeFirst();
                System.out.println(current.val + " -> ");
                current = current.right;
            }

        }
    }

    //前序遍历二叉树  非递归
    public void preOrder(Node root){
        if(root==null)
            return;
        Node current;

        LinkedList<Node> s = new LinkedList<Node>();
        s.addFirst(root);
        while(!s.isEmpty()){
            current = s.removeFirst();
            System.out.println(current.val + "->");
            if(current.right!=null)
                s.addFirst(current.right);
            if(current.left!=null)
                s.addFirst(current.left);
        }
    }

    public void behindOrder(Node root){
        if(root==null)
            return;
        LinkedList<Node> s = new LinkedList<Node>();

        Node curNode;//当前访问的节点
        Node lastVisitNode;//上次访问的节点
        curNode = root;
        lastVisitNode = root;

        while(curNode!=null){
            s.addFirst(curNode);
            curNode = curNode.left;
        }
        while(!s.isEmpty()){
            curNode = s.removeFirst();//弹出栈顶元素
            //根节点被访问的前提是：无右子树或右子树已被访问过
            if(curNode.right!=null&&curNode.right!=lastVisitNode){
                //根节点再次入栈
                s.addFirst(curNode);
                //进入右子树 且可肯定右子树一定不为空
                curNode = curNode.right;
                while(curNode!=null){
                    //走到右子树最左边
                    s.addFirst(curNode);
                    curNode = curNode.left;
                }

            }else{
                System.out.println(curNode.val + "->");
                lastVisitNode = curNode;
            }
        }

    }
}
