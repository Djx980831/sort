package common_interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintABC {

    public static void main(String[] args) {
        final String str = "ABC";
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.print(str);
                }
            });

            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.print(str);
                }
            });

            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(str);
                }
            });
        }
    }
}
