package common_interview;

public class Frog_jumps_steps {
    // 1.一次可以跳上1级台阶，也可以跳上2级。
    public static int jump1(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return jump1(n - 1) + jump1(n - 2);
        }
    }


    // 2.一次可以跳1 ，2，3，4···
    public static int jump2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return 2 * jump2(n - 1);
        }
    }

    // 3.青蛙一次可以跳的台阶数可以比台阶数大
    public static int jump3(int n, int m) {
        //当大于m的时候是上面的公式
        if (n > m) {
            return 2 * jump3(n - 1, m) - jump3(n - 1 - m, m);
        }
        //当小于等于m的时候就是和n级的相同了
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return 2 * jump2(n - 1);
        }
    }

}
