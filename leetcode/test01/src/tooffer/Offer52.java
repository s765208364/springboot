package tooffer;


import hot100.ListNode;

public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA!=headB){
            if(headA!=null)headA = headA.next;
            else
                headA=headB;

            if(headB!=null)headB = headB.next;
            else
                headB=headA;

        }
        return headA;
    }

}