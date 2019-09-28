package search;

import java.util.Scanner;

public class BinSearch {

    public static int getIndex_while(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        if (low > high || key < arr[low] || key > arr[high]) {
            return -1;
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                //查询数组中最后一次出现 key
                //low = mid + 1;
                return mid;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int getIndex_digui(int[] arr, int key, int low, int high) {

            if (low > high || key < arr[low] || key > arr[high]) {
                return -1;
            }
            int mid = (low + high) / 2;
            if (key > arr[mid]) {
                return getIndex_digui(arr, key, mid + 1, high);
            } else if (key < arr[mid]) {
                return getIndex_digui(arr, key, low, mid - 1);
            } else {
                return mid;
            }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int key = s.nextInt();
        int [] arr = new int[]{1,4,6,9,10};
        int flag = getIndex_while(arr, key);
        if(flag == -1){
            if(key > arr[4]){
                flag = 5;
                System.out.println(flag);
                return;
            }
            if(key < arr[0]){
                flag = 0;
                System.out.println(flag);
                return;
            }
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] < key && arr[i + 1] > key){
                    flag = i + 1;
                    System.out.println(flag);
                    return;
                }
            }
        }

        System.out.println(flag);
    }
}
