package normal.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpiltListTest {

    public static void main(String[] args) {
       String str = "hhdhj|ds|ds";
       String[] strings = str.split("|");
       for(int i = 0; i < strings.length; i++) {
           System.out.println(strings[i]);
       }
    }


    public static String unicodeEncode(String string) {
        char[] utfBytes = string.toCharArray();
        String unicodeBytes = "";
        for (int i = 0; i < utfBytes.length; i++) {
            String hexB = Integer.toHexString(utfBytes[i]);
            if (hexB.length() <= 2) {
                hexB = "00" + hexB;
            }
            unicodeBytes = unicodeBytes + "\\u" + hexB;
        }
        return unicodeBytes;
    }
}
