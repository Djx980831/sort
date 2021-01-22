package normal.test;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2019-12-01 11:38
 */
public class HelloA {
    public HelloA(){
        System.out.println("HelloA");
    }
    public void printClassName(){
        System.out.println("i am A Claee");
    }
    static {
        System.out.println("static A");
    }

    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b);
    }
}