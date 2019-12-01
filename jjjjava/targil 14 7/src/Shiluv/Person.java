package Shiluv;

import java.util.ArrayList;

public class Person {

    private String fName, lName;
    private int age;
    private String id;
             ArrayList<Car> carsPerson=new ArrayList<>();


    public Person(String fName, String lName, int age, String id) {
        setfName(fName);
        setlName(lName);
        setAge(age);
        setId(id);
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id =id;
    }



    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
