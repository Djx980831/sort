package common_interview;

import java.util.Scanner;

public class Permute {
    public static void permute(char [] lists, int low, int high){
        int i;
        if(low == high){
            String cout = "";
            for(i = 0; i <= high; i++){
                cout += lists[i];
            }
            System.out.println(cout);
        } else {
            for(i = low; i <= high; i++){
                char temp = lists[low];
                lists[low] = lists[i];
                lists[i] = temp;
                permute(lists, low + 1, high);
                temp = lists[low];
                lists[low] = lists[i];
                lists[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char [] chars = str.toCharArray();
        permute(chars, 0, chars.length - 1);
    }
}
