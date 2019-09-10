package common_interview;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int sum = 0;
        int shan = 0;
        for (int i = 1; i <= t; i++) {
            sum += 13;
            if (m >= 10) {
                shan += 50;
                m -= 10;
            } else {
                m += 4;
            }
           if(shan >= sum){
               sum = shan;
           }
           if(sum > s){
               System.out.println("YES");
               System.out.println(t);
               return;
           }
        }
        System.out.println("NO");
        System.out.println(sum);
    }
}
