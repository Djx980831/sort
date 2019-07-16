package kind;

import java.util.Arrays;

/**
 * @ClassName MaoPao
 * @Description TODO
 * @Author dongjingxiong
 * @Date 2019/7/16 18:39
 * @Version 1.0
 **/
public class MaoPao {

    public static int[] getMaoPao(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 2, 6, 5, 9, 8};
        System.out.println(Arrays.toString(getMaoPao(arr)));
    }
}
