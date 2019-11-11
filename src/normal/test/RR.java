package normal.test;

import java.util.Scanner;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2019-11-04 20:05
 */
public class RR {

    public static int getMax(int[] array) {
        int max = array[0];
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            res = Math.max(res, max);
        }
        return res;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println(getMax(arr));


        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;

        System.out.println((a == c));
        System.out.println((a == e));

    }
}
