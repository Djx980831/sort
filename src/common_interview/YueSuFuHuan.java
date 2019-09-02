package common_interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 约瑟夫环问题
 */
public class YueSuFuHuan {

    public static List<Integer> getLast(int total, int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            list.add(i);
        }

        int k = 0;
        while (list.size() != 1) {
            k = k + num;
            k = (k % list.size()) - 1;

            //判断是否到末尾
            if (k < 0) {
                list.remove(list.size() - 1);
                k = 0;
            } else {
                list.remove(k);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> list = (ArrayList<Integer>) getLast(n,3);
        int result = 0;
        for(Integer i : list){
            result = i;
            break;
        }
        System.out.println(result + 1);
    }
}
