package common_interview;

import java.util.Scanner;

public class StringCount {
    public static int getNum(String str1, String str2) {
        int index;
        int num = 0;
        while ((index = str1.indexOf(str2)) != -1) {
            str1 = str1.substring(index + str2.length());
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        System.out.println(getNum(str1, str2));
    }
}
