package normal.test;

import java.util.Scanner;

public class Main {

    public static int getSolution(int m, int n) {
        if (m == 0) return 1;
        if (n == 0 || n == m) return 1;
        return getSolution(m - 1, n - 1) + getSolution(m - 1, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m == 1) {
            System.out.print("1 1");
        }
        if (m == 0) {
            System.out.print(1);
        }
        for (int i = 0; i <= m; i++) {
            System.out.print(getSolution(m, i) + " ");
        }
    }
}
