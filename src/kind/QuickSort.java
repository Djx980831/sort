package kind;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Description TODO
 * @Author dongjingxiong
 * @Date 2019/7/16 20:16
 * @Version 1.0
 **/
public class QuickSort {
    public static int[] getQuickSort(int[] arr, int low, int high) {
        int temp, i, j, t;
        if (low > high) {
            return arr;
        }
        temp = arr[low];
        i = low;
        j = high;
        while (i < j) {
            while (i < j && arr[j] >= temp) {
                j--;
            }
            while (i < j && arr[i] <= temp) {
                i++;
            }
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }

            arr[low] = arr[i];
            arr[i] = temp;

            getQuickSort(arr, low, j - 1);
            getQuickSort(arr, j + 1, high);

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 2, 6, 5, 9, 8};
        System.out.println(Arrays.toString(getQuickSort(arr, 0, arr.length - 1)));
    }
}
