public class Cow extends Toy {
    int age;

    public Cow(String name, String color, int age) {
        super(name, color);
        setAge(age);
    }

    public int getM_age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
