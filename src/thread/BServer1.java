package thread;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2020-11-28 15:39
 */
public class BServer1 extends AServer implements Runnable{
    public void b_save_method() {
        System.out.println("b中的保存的方法被执行");
    }

    @Override
    public void run() {
        b_save_method();
    }
}
