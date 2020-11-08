package algorithms;

public class LeetCode39 {

        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode nextTemp = null;

            while (head != null) {
                nextTemp = head.next;//先存储下一个节点
                head.next = prev;
                prev = head;
                head = nextTemp;
            }
            return prev;
        }

}
