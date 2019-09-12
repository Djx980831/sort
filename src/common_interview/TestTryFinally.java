package common_interview;

import java.util.ArrayList;

public class TestTryFinally {

    public static int aa() {
        int x = 1;
        try {
            return ++x;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ++x;
        }
        return x;
    }

    public static ArrayList<Integer> test() {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            list.add(6);
        }
        return list;
    }

    public static void main(String[] args) {
//       ArrayList<Integer> list = test();
//       for(Integer i : list){
//           System.out.println(i);
//       }

        Integer a = 256;
        Integer b = 1000;

        boolean flag = a < b;

        System.out.println(flag);
    }
}
