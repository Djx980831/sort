package common_interview;

import java.util.Scanner;

public class ZhuZiZhuangShui {
    public static int getMaxWater(int [] arr){
        int water = 0;
        for(int i = 1; i < arr.length - 1;i++){
            if(arr[i] < arr[i - 1] && arr[i] < arr[i - 1]){
                int temp = Math.min(arr[i - 1], arr[i + 1]);
                int w = temp - arr[i];
                water = water + w;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(getMaxWater(arr));
    }
}
