package erchashu;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * @ClassName Display
 * @Description TODO
 * @Author dongjingxiong
 * @Date 2019/7/17 9:18
 * @Version 1.0
 **/
public class Display {

    public static void breadth(ListNode node) {
        if (node == null) {
            System.out.println("empty tree");
            return;
        }
        ArrayDeque<ListNode> deque = new ArrayDeque<>();
        deque.add(node);
        while (!deque.isEmpty()) {
            ListNode listNode = deque.remove();
            System.out.print(listNode.val + " ");
            if (listNode.left != null) {
                deque.add(listNode.left);
            }
            if (listNode.right != null) {
                deque.add(listNode.right);
            }
        }
    }

    public static void depth(ListNode node) {
        if (node == null) {
            System.out.println("empty tree");
            return;
        }
        Stack<ListNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            ListNode listNode = stack.pop();
            System.out.print(listNode.val + " ");
            if (listNode.right != null) {
                stack.push(listNode.right);
            }
            if (listNode.left != null) {
                stack.push(listNode.left);
            }
        }
    }

}
