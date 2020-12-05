package thread;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2020-11-28 15:06
 */
public class Run3 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread() {
              @Override
              public void run() {
                  try {
                      Thread.sleep(50000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              };
            }.start();
        }
    }
}
