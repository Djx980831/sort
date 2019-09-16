package common_interview;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestABC {

    public static void main(String[] args) {
        Abc abc = new Abc();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    abc.putA();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    abc.putB();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    abc.putC();
                }
            }
        }).start();

    }
}

class Abc {

    private Lock lock = new ReentrantLock();
    private Condition ca = lock.newCondition();
    private Condition cb = lock.newCondition();
    private Condition cc = lock.newCondition();

    private int flag = 1;

    public void putA() {

        try {
            lock.lock();
            if(flag != 1){
                ca.await();
            }
            System.out.print("A");
            flag = 2;
            cb.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void putB() {

        try {
            lock.lock();
            if(flag != 2){
                cb.await();
            }
            System.out.print("B");
            flag = 3;
            cc.signal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void putC() {

        try {
            lock.lock();
            if(flag != 3){
                cc.await();
            }
            System.out.print("C");
            flag = 1;
            ca.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

}