package algorithms;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LeetCode32 {
    public ListNode mergeKLists(ListNode[] lists) {
        LinkedList<Integer>  list = new LinkedList<>();

        if(lists.length==0)return null;
        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null)
            {
                list.add(lists[i].val);
                lists[i]=lists[i].next;
            }

        }
        Collections.sort(list);

        ListNode head = new ListNode(list.get(0));
        ListNode tmp = head;
        for(int i=1;i<list.size();i++){
            tmp.next = new ListNode(list.get(i));
            tmp=tmp.next;
        }

        return head;
    }

}
