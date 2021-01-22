package common_interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return this.value + "-->" + (next != null ? next.toString() : "null");
    }

    //判断单链表是否有环
    public static boolean isLoop(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

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
    public static ListNode reverse(ListNode root) {
        if (root == null || root.next == null) {
            return root;
        }
        ListNode head = reverse(root.next);
        root.next.next = root;
        root.next = null;
        return head;
    }

    public static ArrayList<Integer> printList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        if (head != null) {
            list.addAll(printList(head.next));
            list.add(head.value);
        }
        return list;
    }

    //判断单链表是否有环
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            } else {
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }

    //逆置单链表的指定部分
    public static ListNode reverseSome(ListNode head, int from, int to) {
        ListNode pCur = head.next;
        ListNode result;
        result = head;
        int i;
        //找到开始翻转的位置的前一个节点
        for (i = 0; i < from - 1; i++) {
            head = pCur;
            pCur = pCur.next;
        }
        ListNode pPre = pCur;
        pCur = pCur.next;
        to--;
        ListNode pNext;
        for (; i < to; i++) {
            pNext = pCur.next;
            pCur.next = head.next;
            head.next = pCur;
            pPre.next = pNext;
            pCur = pNext;
        }
        return result;
    }

    public static Integer hasCycleAndGetNode(ListNode head) {
        ListNode slow = head;
        ListNode quick = head;
        while (quick != null && quick.next != null) {
            quick = quick.next.next;
            slow = slow.next;
            if (quick == slow) {
                break;
            }
        }
        if (quick == null || quick.next == null) {
            return null;
        }
        slow = head;
        Integer i = 0;
        while (quick != slow) {
            slow = slow.next;
            quick = quick.next;
            i++;
        }
        //return slow;
        return i - 1;
    }

    //获取单链表指定倒数位置得key
    public static ListNode getDaoShuKey(ListNode head, int k) {
        if (k <= 0 || head == null) {
            return null;
        }

        ListNode h1 = head;
        ListNode h2 = head;

        for (int i = 0; i < k; i++) {
            if (h2.next != null) {
                h2 = h2.next;
            } else {
                return null;
            }
        }

        while (h2.next != null) {
            h1 = h1.next;
            h2 = h2.next;
        }

        return h1;
    }

    //简单的单链表的逆置
    public static ListNode reverseList(ListNode root) {
        if (root == null || root.next == null) {
            return null;
        }
        ListNode p1 = root;
        ListNode p2 = root.next;
        ListNode p3 = null;

        while (p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        root.next = null;
        root = p1;

        return root;
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);
        ListNode h = new ListNode(8);
        ListNode i = new ListNode(9);
        ListNode j = new ListNode(10);
//        ListNode k = new ListNode(11);
//        ListNode l = new ListNode(12);
//        ListNode m = new ListNode(13);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = f;

        System.out.println(hasCycleAndGetNode(a));

//        k.next = l;
//        l.next = m;
        //reverse(a);
        //ListNode result = getDaoShuKey(a, 6);

        // System.out.println(result);
//        ArrayList<Integer> list = printList(a);
//        for(Integer integer : list){
//            System.out.println(integer);
//        }
    }

    //非递归的方法其实就是顺着头结点往尾结点遍历，遍历期间把每个结点的nextNode替换掉，
    //替换过程需要注意临时存储下一个节点
    public static ListNode reverse_1(ListNode node) {
        ListNode pre = node;
        ListNode cur = node.next;
        pre.next = null;
        ListNode tmp = null;
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
