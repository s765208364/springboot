package algorithms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class LeetCode35 {
    public ListNode sortList(ListNode head) {
        if(head==null)return null;

        LinkedList<Integer> list = new LinkedList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;

        }
        Collections.sort(list);

        head = new ListNode(list.getFirst());
        ListNode temp=head;
        list.removeFirst();

        while(list.size()!=0){

            head.next=new ListNode(list.getFirst());
            list.removeFirst();
            head=head.next;

        }

        return temp;
    }


}
