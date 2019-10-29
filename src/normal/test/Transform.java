package normal.test;

import java.util.Scanner;
import java.util.Stack;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2019-10-17 15:52
 */
public class Transform {

    public static String getResoult(int n, int m) {
        StringBuilder stringBuilder = new StringBuilder();
        Stack s = new Stack();
        while (n != 0) {
            s.push(n % m);
            n = n / m;
        }
        while (!s.empty()) {
            int a = (int) s.pop();
            if (a < 10) {
                stringBuilder.append(a);
            } else {
                switch (a) {
                    case 10 :
                        stringBuilder.append("A");
                        break;
                    case 11 :
                        stringBuilder.append("B");
                        break;
                    case 12 :
                        stringBuilder.append("C");
                        break;
                    case 13 :
                        stringBuilder.append("D");
                        break;
                    case 14 :
                        stringBuilder.append("E");
                        break;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(getResoult(n, m));
    }
}
