package common_interview;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2020-03-24 20:08
 */
public class Change {

    public static int getCount(String s1, String s2){
        int count = 0;
        char []aa = s1.toCharArray();
        char []bb = s2.toCharArray();
        int i = 0;
        while(i < aa.length) {
            int j = i;
            System.out.println(j);
            System.out.println(isFlag(aa[j], bb[j]));
            while(!isFlag(aa[j], bb[j]) && j < aa.length){
                j++;
            }
            if (j == i) {
                i++;
            } else {
                count++;
                i = j;
            }
        }
        return count;

    }

    public static boolean isFlag(char a, char b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));

    }
}
