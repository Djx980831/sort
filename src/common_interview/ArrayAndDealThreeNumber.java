package common_interview;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndDealThreeNumber {

    public static int getCount(Integer[] arr, int key) {
        int count = 0;
        Arrays.sort(arr);
        int sum;
        for (int i = 0; i < arr.length - 2; i++) {
            int m = i + 1;
            int k = arr.length - 1;
            while(m < k){
                sum = arr[i] + arr[m] + arr[k];
                if(sum >= key){
                    k--;
                } else {
                    count += k - m;
                    k = arr.length - 1;
                    m++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Integer key = scanner.nextInt();

        System.out.println(getCount(arr, key));
    }
}
