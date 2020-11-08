package algorithms;

public class LeetCode38 {
    public ListNode reverseList(ListNode head) {

        if(head==null) return null;
        ListNode last = head.next;
        ListNode pre = null;
        while(last!=null){

            head.next = pre;
            pre = head;
            head = last;
            last = last.next;

        }
        head.next = pre;
        return head;

    }

}
