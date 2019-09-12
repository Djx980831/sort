package normal.string;

import java.util.Scanner;

public class IsHuiWen {

    public static boolean isTrue(String string) {
        boolean flag = true;
        int i = 0;
        int j = string.length() - 1;
        while (i <= j) {
            char c1 = string.charAt(i);
            char c2 = string.charAt(j);
            if (c1 == c2) {
                i++;
                j--;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isTrue(scanner.nextLine()));
    }
}
