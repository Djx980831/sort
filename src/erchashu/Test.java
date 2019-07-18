package erchashu;

import javax.swing.tree.TreeNode;

/**
 * @ClassName Test
 * @Description TODO
 * @Author dongjingxiong
 * @Date 2019/7/17 9:45
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{
                1,2,5,8,3,12
        };
        BinaryTree binaryTree = new BinaryTree();
        ListNode root = binaryTree.getBinaryTree(arr, 0);
        Display.depth(root);
        System.out.println("\n深度优先遍历结束。。。");
        Display.breadth(root);
        System.out.print("\n广度优先遍历结束。。。");
    }
}
