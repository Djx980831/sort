package kind;

import java.util.Arrays;

/**
 * @ClassName SelectSort
 * @Description TODO
 * @Author dongjingxiong
 * @Date 2019/7/16 18:54
 * @Version 1.0
 **/
public class SelectSort {

    public static int[] getSelectSort(int[] arr) {
        int minIndex;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 5, 1, 9, 12, 10};
        System.out.println(Arrays.toString(getSelectSort(arr)));
    }
}
