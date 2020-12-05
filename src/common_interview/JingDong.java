package common_interview;

import java.util.*;

public class JingDong {


    public static void main(String[] args) {

        int k = getNum(Integer.parseInt((new Scanner(System.in)).nextLine()));
        System.out.println(k);
    }

    public static int getNum(int n1) {
        int n = n1;
        String k = "";
        if (n <= 9) {
            return -1;
        }
        for (int i = 9; i >= 2; ) {
            if (n % i == 0) {
                k += i;
                n = n / i;
                continue;
            } else
                i--;
        }
        int j = 0;
        int n2 = 1;
        while (j < k.length()) {
            n2 = n2 * Integer.parseInt(k.charAt(j) + "");
            j++;
        }
        if (n2 != n1) {
            return -1;
        }
        String temp = "";
        for (int i = k.length() - 1; i >= 0; i--) {
            temp += k.charAt(i);
        }
        return Integer.parseInt(temp);
    }
}
