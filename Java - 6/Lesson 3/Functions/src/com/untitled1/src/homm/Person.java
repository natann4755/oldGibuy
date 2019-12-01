package homm;

public class Person {
    String name ="yy";
    String ID ="099";
    Date date = new Date();
//


    public Person(String name, String ID, Date date) {
        System.out.println(this);
        this.name = name;
        System.out.println(this);
        this.ID = ID;
        System.out.println(this);
        this.date = date;
    }
    public Person(){}

    public Person(String nn, String id) {
        this(id);
        this.name = nn;
       // this.date = date;

    }

    public Person(String id) {
        this.ID = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", date=" + date +
                '}';
    }
}
