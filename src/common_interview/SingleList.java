package common_interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

    public static ArrayList<Integer> printList(SingleList head) {
        ArrayList<Integer> list = new ArrayList<>();
        if (head != null) {
            list.addAll(printList(head.next));
            list.add(head.value);
        }
        return list;
    }

    //判断单链表是否有环
    public static boolean hasCycle(SingleList head) {
        Set<SingleList> set = new HashSet<>();
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




    public static SingleList hasCycleAndGetNode(SingleList head) {
        SingleList slow = head;
        SingleList quick = head;
        while (quick != null && quick.next != null) {
            quick = quick.next.next;
            slow = slow.next;
            if (quick == slow) {
                break;
            }
        }
        if(quick == null || quick.next == null){
            return null;
        }
        slow = head;
        while (quick != slow) {
            slow = slow.next;
            quick = quick.next;
        }
        return slow;
    }

    //获取单链表指定倒数位置得key
    public static SingleList getDaoShuKey(SingleList head, int k) {
        if (k <= 0 || head == null) {
            return null;
        }

        SingleList h1 = head;
        SingleList h2 = head;

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

    public static void main(String[] args) {

        System.out.println("__-----------------------");

        SingleList a = new SingleList(1);
        SingleList b = new SingleList(2);
        SingleList c = new SingleList(3);
        SingleList d = new SingleList(4);
        SingleList e = new SingleList(5);
        SingleList f = new SingleList(6);
        SingleList g = new SingleList(7);
        SingleList h = new SingleList(8);
        SingleList i = new SingleList(9);
        SingleList j = new SingleList(10);
//        SingleList k = new SingleList(11);
//        SingleList l = new SingleList(12);
//        SingleList m = new SingleList(13);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = j;


        System.out.println(reverse(a));

//        k.next = l;
//        l.next = m;
        //reverse(a);
        //SingleList result = getDaoShuKey(a, 6);

        // System.out.println(result);
//        ArrayList<Integer> list = printList(a);
//        for(Integer integer : list){
//            System.out.println(integer);
//        }
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
