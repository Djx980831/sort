package normal.array;

public class MissingValue {

    public static int getValue(int[] arr) {
        int value;
        int result = getSum(100);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        value = result - sum;

        return value;
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
