package hot100;
import java.util.List;
public class Hot23 {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists,0, lists.length-1);

    }

    public ListNode mergeTwoLists(ListNode a,ListNode b){
        if(a==null||b==null)
            return a!=null?a:b;
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(a!=null&&b!=null){
            if(a.val<b.val){
                head.next=a;
                a = a.next;
            }else{
                head.next=b;
                b=b.next;
            }
            tail = tail.next;

        }
        tail.next = (a!=null?a:b);

        return head.next;
    }

    public ListNode merge(ListNode[] lists,int l,int r){
        if(l==r){
            return lists[l];
        }
        if(l>r){
            return null;
        }
        int mid = (l+r)/2;
        return mergeTwoLists(merge(lists,l,mid),merge(lists,mid+1,r));

    }

}
