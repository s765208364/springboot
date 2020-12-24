package tooffer;

import hot100.ListNode;

public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode cur = null, pre = head,tmp=head;
        while (pre != null) {
            if (pre.val == val) {
                cur.next = pre.next;
                pre = pre.next;
            } else {
                cur = pre;
                pre = pre.next;

            }
        }
        return tmp;
    }

}
