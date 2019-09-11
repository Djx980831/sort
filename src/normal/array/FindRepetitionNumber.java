package normal.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindRepetitionNumber {
    public static void getRepeNum(int [] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++){
            int mid = arr[i] ^ arr[i + 1];
            if(mid == 0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        getRepeNum(arr);
    }
}
