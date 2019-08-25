package common_interview;

public class SingleList {
    int value;
    SingleList next;


    public SingleList(int value) {
        this.value = value;
        this.next = null;
    }

    public static boolean isLoop(SingleList head){
        if (head == null) {
            return false;
        }
        SingleList fast = head;
        SingleList slow = head;

        fast = fast.next.next;
        slow = slow.next;

        if(fast == slow){
            return true;
        }else{
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
