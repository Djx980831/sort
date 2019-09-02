package common_interview;

import java.util.Scanner;

public class TheStringChangeNum {

    public static int theMinNum(String str1, String str2) {

        int[][] arr = new int[str1.length()][str2.length()];

        for (int i = 1; i < str1.length(); i++) {
            arr[i][0] = i;
        }
        for (int i = 1; i < str2.length(); i++) {
            arr[0][i] = i;
        }

        for (int i = 1; i < str1.length(); i++) {
            for (int j = 1; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    arr[i][j] = arr[i - 1][j - 1];
                } else {
                    arr[i][j] = Math.min(arr[i - 1][j - 1], Math.min(arr[i][j - 1], arr[i - 1][j])) + 1;
                }
            }
        }
        return arr[str1.length() - 1][str2.length() - 1];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = "#" + s.next();
        String str2 = "#" + s.next();
        System.out.println(theMinNum(str1, str2));
    }
}
