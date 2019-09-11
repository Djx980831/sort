package normal.list;

public class ReverseList {
    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return null;
        }
        ListNode p1,p2,p3;
        p1 = head;
        p2 = head.next;

        while(p2 != null){
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        head.next = null;
        head = p1;

        return head;
    }
}
