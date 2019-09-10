package common_interview;

import java.util.Scanner;

public class PeocessTree {

    public static int getNum(int[] a, int[] b, int key) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                count++;
                for (int j = 0; j < b.length; j++) {
                    if (b[j] == a[i] && b[j] != 0) {
                        count++;
                        for (int k = 0; k < a.length; k++) {
                            if (a[k] == b[j] & a[k] != 0) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        int key = s.nextInt();
        String[] s1 = str1.split(" ");
        String[] s2 = str2.split(" ");
        int[] a = new int[s1.length];
        int[] b = new int[s1.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.valueOf(s1[i]);
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.valueOf(s2[i]);
        }

        System.out.println(getNum(a, b, key));
    }
}
