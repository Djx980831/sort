package bytedance;

import java.util.Arrays;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2020-07-07 09:32
 */
public class MergeArray {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        while (len1 > 0 && len2 > 0) {
            // 注意--符号在后面，表示先进行计算再减1，这种缩写缩短了代码
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
        return nums1;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 6};
        int[] num2 = new int[]{3, 4, 5};
        num1 = merge(num1, num1.length, num2, num2.length);
        System.out.println(Arrays.toString(num1));
    }
}
