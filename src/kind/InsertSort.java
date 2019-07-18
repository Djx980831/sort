package kind;

import java.util.Arrays;

/**
 * @ClassName InsertSort
 * @Description TODO
 * @Author dongjingxiong
 * @Date 2019/7/16 20:00
 * @Version 1.0
 **/
public class InsertSort {

    public static int[] getInsertSort(int[] arr) {
        int preIndex, current;
        for (int i = 1; i < arr.length; i++) {
            current = arr[i];
            preIndex = i - 1;
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 9, 20, 32, 21, 6};
        System.out.println(Arrays.toString(getInsertSort(arr)));
    }
}
