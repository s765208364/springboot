package algorithms;

public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return true;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != slow ){
            if(fast==null||slow == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;

        }

        return true;
    }


}
