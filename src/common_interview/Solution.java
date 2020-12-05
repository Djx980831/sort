package common_interview;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2020-04-03 15:06
 */
public class Solution {

    public int getTreeHeight (TreeNode root) {
        // write code here
        int l, r;
        if (root.equals('#')) {
            return 1;
        } else {
            l = getTreeHeight(root.left);
            r = getTreeHeight(root.right);
        }
        if (l > r) {
            return l + 1;
        } else {
            return r + 1;
        }
    }
}
