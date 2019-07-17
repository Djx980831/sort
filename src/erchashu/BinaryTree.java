package erchashu;

import javax.swing.tree.TreeNode;

/**
 * @ClassName Tree
 * @Description TODO
 * @Author dongjingxiong
 * @Date 2019/7/17 9:44
 * @Version 1.0
 **/
public class Tree {
    public TreeNode getBinaryTree(int[] arr, int index) {
        // TODO Auto-generated method stub
        TreeNode node = null;
        if(index < arr.length){
            int value = arr[index];
            node = new TreeNode(value);
            node.left = getBinaryTree(arr, index*2+1);
            node.right = getBinaryTree(arr, index*2+2);
            return node;
        }
        return node;
    }
}
