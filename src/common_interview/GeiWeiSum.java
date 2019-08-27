package common_interview;

import java.util.Scanner;

public class GeiWeiSum {

    //求个位数字之和
    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            sum = sum + temp % 10;
        }
        return sum;
    }

    //求各位数字之和
    public static int getEverySum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(getSum(n));
    }
}
