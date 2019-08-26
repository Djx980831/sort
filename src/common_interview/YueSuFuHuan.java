package common_interview;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(getLast(10,4));
    }
}
