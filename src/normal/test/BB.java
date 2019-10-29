package normal.test;

import java.util.Arrays;
import java.util.Scanner;

public class BB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] persons = new int[n];
        for (int i = 0; i < n; i++) {
            persons[i] = scanner.nextInt();
        }
        Arrays.sort(persons);
        int sum = 0;
        while (n > 3) {
            int less = persons[0] + 2 * persons[1] + persons[n - 1];
            if ((persons[0] + 2 * persons[1] + persons[n - 1]) > (2 * persons[0]
                    + persons[n - 2] + persons[n - 1]))
                less = 2 * persons[0] + persons[n - 2] + persons[n - 1];
            sum += less;
            n -= 2;
        }

        if (n == 3) {
            sum += persons[0] + persons[1] + persons[2];
        } else if (n == 2) {
            sum += persons[1];
        } else {
            sum += persons[0];
        }
        System.out.println(sum);
    }
}