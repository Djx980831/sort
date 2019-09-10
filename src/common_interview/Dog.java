package common_interview;

public class Dog extends Animal {
    private String kind;
    private int price;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void eat() {
        System.out.println("i am dog, i like eating gutou");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "kind='" + kind + '\'' +
                ", price=" + price +
                '}';
    }

    public static void sayHello() {
        System.out.println("Hello,I am DJX");
    }

    public void run() {
        System.out.println("i like running");
    }

    public static int getNum(int n) {
        if (n < 2) {
            return n;
        }
        return getNum(n - 1) + getNum(n - 2);
    }

    //测试jdk8之后重写对返回值的要求
    @Override
    public Animal getOne() {
        Dog dog = new Dog();
        dog.setKind("erha");
        dog.setPrice(2222);
        return dog;
    }

    public void printAge(){
        System.out.println("i am 15 years old");
    }

    public static void main(String[] args) {
//        Animal a = new Dog();
//        a.eat();

        System.out.println(getNum(5));

    }
}
