package algorithms;

public class LeetCode30 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(-1);

        ListNode prv = result;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                prv.next=l1;
                l1=l1.next;
            }else{
                prv.next=l2;
                l2=l2.next;

            }
            prv=prv.next;
        }
        prv.next = l1==null?l2:l1;

        return result.next;

    }


}
