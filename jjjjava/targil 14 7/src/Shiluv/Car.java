package Shiluv;

public class Car {
    String company;
    int age;
    String colore;
    int number;
    Person nameOfPerson ;
          Car[] carss = new Car[100];
     String[] companys = new String[]{"yoyta", "mazda", "subaro", "volvo"};
     String[] colors = new String[]{"red", "black", "yello", "green"};


    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", age=" + age +
                ", colore='" + colore + '\'' +
                ", number=" + number +
                '}';
    }
}
