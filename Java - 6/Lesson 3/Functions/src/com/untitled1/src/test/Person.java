package test;

public class Person {
    String name = Main.print("Avi");

    public Person(String name) {
        System.out.println(this.name);
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
