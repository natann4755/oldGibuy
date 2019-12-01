package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(50,10));
        cars.add(new Car(43,11));
        cars.add(new Car(67,3));
        cars.add(new Car(100,1));
        cars.add(new Car(100,100));

        cars.sort(new Car.CarOrderBy(Car.priceParameter, true));
        System.out.println(cars);
        cars.sort(new Car.CarOrderBy(Car.ageParameter, false));
        System.out.println(cars);
        String d = "kkkkk";
        d.toString();
        d.hashCode();
        d.length();
        Object o ;
        o.equals();
        int tt [] = new int[]{2,4};
        ArrayList<Car> intt = new ArrayList<>();
        Boolean b1 = true;
        Boolean b2 = false;
        Integer x1=2,x2=3;
        int res = x1 + x2;
        if (b1 && b2)
            System.out.println("rr");

    }
}
