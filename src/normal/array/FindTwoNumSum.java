package normal.array;

import java.util.HashMap;
import java.util.Scanner;

public class FindTwoNumSum {
    public static void getNumber(Integer[] arr, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(key - arr[i])){
                System.out.println(arr[i] + " " + (key - arr[i]));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer [] arr = new Integer[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        getNumber(arr, key);
    }
}
