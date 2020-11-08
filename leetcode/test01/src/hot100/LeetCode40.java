package hot100;

public class LeetCode40 {
    public boolean isPalindrome(ListNode head) {
        if(head==null)return true;

        ListNode fast=head.next,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode head2 = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode nextTemp = null;

        while (head2 != null) {
            nextTemp = head2.next;//先存储下一个节点
            head2.next = prev;
            prev = head2;
            head2 = nextTemp;
        }

        while(prev!=null&&head!=null&&prev.val==head.val) {
            prev=prev.next;
            head=head.next;
        }
        if((prev==null&&head==null)||(prev==null&&head!=null))return true;

        return false;

    }

}
