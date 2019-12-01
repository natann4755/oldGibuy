package constru;

public class Person {
    String name= null;
    String last = ""; // ""
    int id = 100; // 0
    Date date; // null

    // constructor
    public Person () {
        this("", "", 11, true); // call other constructor
        System.out.println("default constructor");
    }


    public Person(String name, String last, int id, boolean defaultDate) {
        this(name, last, id, defaultDate ? new Date(1, 1, 1980) : null);
    }

    public Person(String name, String last, int id, Date date) {
        System.out.println("constructor : String name, String last, int id, Date date");
        this.name = name;
        this.last = last;
        if(id > 1000) {
            this.id = id;
        } else {
            this.id = -1;
        }

        if(this.name == null) {
            name = "";
        }
        this.date = date;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", id=" + id +
                ", date=" + date +
                '}';
    }
}
