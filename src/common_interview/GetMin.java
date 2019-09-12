package common_interview;

import java.util.Scanner;

public class GetMin {
    public static int getMinSum(int[][] arr) {

        int[][] brr = new int[arr.length][arr[0].length];
        brr[0][0] = arr[0][0];

        for (int i = 1; i < arr.length; i++) {
            brr[i][0] = brr[i - 1][0] + arr[i][0];
        }

        for (int j = 1; j < arr[0].length; j++) {
            brr[0][j] = brr[0][j - 1] + arr[0][j];
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (brr[i - 1][j] < brr[i][j - 1]) {
                    brr[i][j] = brr[i - 1][j] + arr[i][j];
                } else {
                    brr[i][j] = brr[i][j - 1] + arr[i][j];
                }
            }
        }
        return brr[arr.length - 1][arr[0].length - 1];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(getMinSum(arr));
    }
}
