package boss;

import java.util.Scanner;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2020-04-03 14:42
 */
public class Fouth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String res = change(scanner.nextInt());
        System.out.println(getNum(scanner.nextInt()));
    }

    public static String change(int n) {
        String res = "";
        while (n != 0) {
            res = n % 2 + res;
            n = n / 2;
        }
        return res;
    }

    public static int getCount(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                count++;
            }
        }
        return count;
    }

    public static int getNum(int n) {

        int count = 0;
        while (n != 0) {
           n = n & (n - 1);
           count++;
        }
        return count;
    }
}
