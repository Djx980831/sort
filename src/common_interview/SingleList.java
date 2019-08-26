package common_interview;

public class SingleList {
    int value;
    SingleList next;

    public SingleList(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return this.value + "-->" + (next != null ? next.toString() : "null");
    }

    //判断单链表是否有环
    public static boolean isLoop(SingleList head) {
        if (head == null) {
            return false;
        }
        SingleList fast = head;
        SingleList slow = head;

        fast = fast.next.next;
        slow = slow.next;

        if (fast == slow) {
            return true;
        } else {
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    //单链表的逆置
    //递归用栈的思想，先把头节点进栈，接着头节点的下一节点再进栈，直到尾节点的位置
    public static SingleList reverse(SingleList node) {
        System.out.println("before:" + node);
        if (node == null || node.next == null) {
            System.out.println("after:" + node);
            return node;
        }
        SingleList head = reverse(node.next);
        node.next.next = node;
        node.next = null;
        System.out.println("after:" + head);
        return head;
    }

    public static void main(String[] args) {
        SingleList a = new SingleList(1);
        SingleList b = new SingleList(2);
        SingleList c = new SingleList(3);
        SingleList d = new SingleList(4);
        a.next = b;
        b.next = c;
        c.next = d;
        reverse(a);
    }

    //非递归的方法其实就是顺着头结点往尾结点遍历，遍历期间把每个结点的nextNode替换掉，
    //替换过程需要注意临时存储下一个节点
    public static SingleList reverse_1(SingleList node) {
        SingleList pre = node;
        SingleList cur = node.next;
        pre.next = null;
        SingleList tmp = null;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;
            System.out.println("not ready:" + tmp);
            System.out.println("already:" + cur);
            System.out.println("------");
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

}
