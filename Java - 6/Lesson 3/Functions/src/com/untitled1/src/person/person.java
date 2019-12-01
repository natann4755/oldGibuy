package person;

import constru.Date;

public class person {
    String name;
    String last;
    String ID;
    Date date;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", ID='" + ID + '\'' +
                ", date=" + date +
                '}';
    }
}
