public class Cat extends Toy{
    int age;

    public Cat(String name, String color, int age) {
        super(name, color);
        this.age = age;
    }
    public int getM_age() {
        return age;
    }
}
