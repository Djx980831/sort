package kind;

/**
 * @ClassName GuiBingSort
 * @Description TODO
 * @Author dongjingxiong
 * @Date 2019/7/17 15:13
 * @Version 1.0
 **/
public class GuiBingSort {

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length];
        int p1 = left, p2 = mid + 1, k = left;

        while (p1 <= mid && p2 <= right) {
            if (arr[p1] <= arr[p2]) {
                temp[k++] = arr[p1++];
            } else {
                temp[k++] = arr[p2++];
            }
        }

        while (p1 <= mid) {
            temp[k++] = arr[p1++];
        }
        while (p2 <= right) {
            temp[k++] = arr[p2++];
        }

        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {//当子序列中只有一个元素时结束递归
            int mid = (start + end) / 2;//划分子序列
            mergeSort(arr, start, mid);//对左侧子序列进行递归排序
            mergeSort(arr, mid + 1, end);//对右侧子序列进行递归排序
            merge(arr, start, mid, end);//合并
        }
    }

    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 50};
        mergeSort(a, 0, a.length - 1);
        System.out.println("排好序的数组：");
        for (int e : a)
            System.out.print(e + " ");
    }
}
