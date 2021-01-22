package normal.test;

public class Animal {

    String name;
    String red;
    int leg;
    int age;
    private String id;

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "red='" + red + '\'' +
                ", leg=" + leg +
                ", age=" + age +
                '}';
    }

    public void printInfo(String name, String red, int leg, int age) {
        System.out.println("我叫:" + name + ", 颜色是：" + red + ", 有" + leg + "腿，" + age + "岁了。 ");
    }

    public void shout() {
        System.out.println("叫了一声");
    }

    public Animal() {}

    public Animal(String name, String red, int leg, int age, String id) {
        this.name = name;
        this.red = red;
        this.leg = leg;
        this.age = age;
        this.id = id;

        System.out.println(name + red + leg + age + id);
    }
}
