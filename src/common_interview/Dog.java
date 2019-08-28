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
    public String toString() {
        return "Dog{" +
                "kind='" + kind + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Animal getOne(){
        Dog dog = new Dog();
        dog.setKind("erha");
        dog.setPrice(2222);
        return dog;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getOne());
    }
}
