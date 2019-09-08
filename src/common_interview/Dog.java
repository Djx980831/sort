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
    public void eat(){
        System.out.println("i am dog, i like eating gutou");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "kind='" + kind + '\'' +
                ", price=" + price +
                '}';
    }

    //测试jdk8之后重写对返回值的要求
    @Override
    public Animal getOne(){
        Dog dog = new Dog();
        dog.setKind("erha");
        dog.setPrice(2222);
        return dog;
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
    }
}
