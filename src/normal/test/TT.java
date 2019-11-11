package normal.test;

import java.util.ArrayList;
import java.util.Scanner;

public class TT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        ArrayList<Integer> printList = new ArrayList<Integer>();
        printList = print(array);
        for (int i = 0; i < printList.size(); i++) {
            if (i == printList.size() - 1) {
                System.out.print(printList.get(i));
            } else {
                System.out.print(printList.get(i) + ",");
            }
        }

        int a = 10;
        System.out.println(a);
        System.out.println("iiiii");
    }

    public static ArrayList<Integer> print(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int start = 0;
        while (rows > start * 2 && columns > start * 2) {
            int endRow = rows - 1 - start;
            int endColumn = columns - 1 - start;
            for (int i = start; i <= endColumn; i++)
                myList.add(array[start][i]);
            if (endRow > start) {
                for (int i = start + 1; i <= endRow; i++)
                    myList.add(array[i][endColumn]);
            }
            if (endRow > start && endColumn > start) {
                for (int i = endColumn - 1; i >= start; i--)
                    myList.add(array[endRow][i]);
            }
            if (endRow >= start + 2 && endColumn > start) {
                for (int i = endRow - 1; i > start; i--)
                    myList.add(array[i][start]);
            }
            start++;
        }
        return myList;
    }
}