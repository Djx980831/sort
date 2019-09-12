package common_interview;

import java.util.Scanner;

public class _2048 {

    public static int[][] moveLeft(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i][k] != 0) {
                            arr[i][j] = arr[i][k];
                            arr[i][k] = 0;
                            break;
                        }
                    }
                }
            }

            for (int j = 0; j < n - 1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    arr[i][j] *= 2;
                    arr[i][j + 1] = 0;
                }
            }

            for (int j = 0; j < n - 1; j++) {
                if (arr[i][j] == 0 && arr[i][j + 1] != 0) {
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = 0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        arr = moveLeft(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
