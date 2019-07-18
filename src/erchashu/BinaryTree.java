package erchashu;

/**
 * @ClassName BinaryTree
 * @Description TODO
 * @Author dongjingxiong
 * @Date 2019/7/17 9:44
 * @Version 1.0
 **/
public class BinaryTree {

    public ListNode getBinaryTree(int[] arr, int index) {

        ListNode node = null;
        if(index < arr.length){
            int value = arr[index];
            node = new ListNode(value);
            node.left = getBinaryTree(arr, index*2+1);
            node.right = getBinaryTree(arr, index*2+2);
            return node;
        }
        return node;
    }
}
