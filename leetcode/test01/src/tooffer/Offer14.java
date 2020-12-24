package tooffer;

import hot100.ListNode;

public class Offer14 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = null,pre = head,tmp;

        while(pre!=null){
            tmp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = tmp;
        }
        return cur;
    }

}
