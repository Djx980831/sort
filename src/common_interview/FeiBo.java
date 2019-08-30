package common_interview;

public class FeiBo {

    public static int getSum(int n){

        int sum = 0;
        int a = 1;
        int b = 1;
        sum = a + b;
        for(int i = 3; i < n; i++){
            a = b;
            b = sum;
            sum = a + b;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(10));
    }
}
