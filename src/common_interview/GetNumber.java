package common_interview;

import java.util.Scanner;

public class GetNumber {

    public static int getSum(int[] arr) {
        int sum = 0;
        int[] brr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    brr[i] = 2;
                } else {
                    brr[i] = 1;
                }
            } else if (i == arr.length - 1) {
                if (arr[i] > arr[i - 1]) {
                    brr[i] = brr[i - 1] + 1;
                } else {
                    brr[i] = 1;
                }
            } else if (i == arr.length - 2) {
                if(arr[i] < arr[i - 1] && arr[i] > arr[i + 1]){
                    brr[i] = 2;
                } else if(arr[i] > arr[i + 1] && arr[i] > arr[i - 1]){
                    brr[i] = brr[i - 1] + 1;
                } else if(arr[i] < arr[i - 1] && arr[i] < arr[i + 1]){
                    brr[i] = 1;
                }
            } else {
                if ((arr[i] > arr[i + 1] || arr[i] > arr[i - 1])) {
                    brr[i] = brr[i - 1] + 1;
                } else {
                    brr[i] = 1;
                }
            }
        }

        for (int i = 0; i < brr.length; i++) {
            sum = sum + brr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(getSum(arr));
    }
}
