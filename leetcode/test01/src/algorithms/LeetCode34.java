package algorithms;

public class LeetCode34 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast=head,slow=head;
        while(true){
            if(fast==null||fast.next==null)return null;
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow)break;

        }
        fast = head;

        if(fast!=slow){
            fast=fast.next;
            slow=slow.next;

        }

        return fast;
    }

}
