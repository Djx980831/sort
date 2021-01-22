package boss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2020-04-16 16:33
 */
public class AA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList(m);
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        int count = 0;
        int j = 1;
        int max = list.get(0);
        int sum = 0;
        while (count < m) {
            sum++;
            int temp = list.get(j);
            int t = max;
            if (max > temp) {
                list.add(temp);
                if (t != max) {
                    count = 0;
                }
                count++;
            } else {
                max = temp;
                list.add(max);
                if (t != max) {
                    count = 0;
                }
                count++;
            }
            j++;
        }
        System.out.println(sum);
    }
}
