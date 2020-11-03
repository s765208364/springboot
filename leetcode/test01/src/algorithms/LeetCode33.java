package algorithms;

import java.util.HashSet;
import java.util.Set;

public class LeetCode33 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head!=null){
            if(!set.contains(head))
            set.add(head);
            else
                return head;

            head=head.next;
        }
        return null;
    }

}
