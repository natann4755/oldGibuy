package com.company;

import java.util.Comparator;

public class Car {
    private double price;
    private int age;
    final public static String priceParameter = "price";
    final public static String ageParameter = "age";

    public Car(double price, int age) {
        this.price = price;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "<Car- price: " + price + " ,age:" + age + ">";    }

    public static class CarOrderBy implements Comparator<Car> {
        private String param;
        private boolean up;
        public CarOrderBy(String parameter,boolean up) {
            this.up=up;
            param = parameter;
        }
        @Override
        public int compare(Car o1, Car o2) {

            if (param.equals(ageParameter)) {
                if((o1.age > o2.age) == up)
                    return 1;
                return -1;
            } else if (param.equals(priceParameter)) {
                if((o1.price > o2.price) == up)
                    return 1;
                return -1;
            } else {
                if(o1.getAge() > o2.getAge())
                    return 1;
                return -1;
            }

        }
    }
}
