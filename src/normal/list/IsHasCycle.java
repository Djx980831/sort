package normal.list;

public class IsHasCycle {
    public static ListNode getNode(ListNode head){
        boolean flag = false;
        ListNode fast = head;
        ListNode slow = head;

        if (head == null || head.next == null) {
            return null;
        }

        while(fast.next != null && fast != null ){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }

        if(flag){
            slow = head;
            while(slow != fast){
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
        return null;
    }
}
