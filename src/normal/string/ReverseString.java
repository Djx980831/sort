package normal.string;

import java.util.Scanner;

public class ReverseString {

    public static String reverseStr(String str){
        if(str.length() <= 1){
            return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(reverseStr(s.nextLine()));
    }
}
