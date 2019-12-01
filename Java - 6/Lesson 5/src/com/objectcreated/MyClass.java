package com.objectcreated;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        Sub sub = new Sub();
        Shape[] arr = new Shape[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Choose shape: \n1 - circle\n2 - Rectangle\n3 - Triangle");
            int chooses = Integer.parseInt(scan.nextLine());
            if(chooses == 1){
                System.out.println("Enter radius");
                int radius = Integer.parseInt(scan.nextLine());
                Circle c = new Circle();
                c.radius = radius;
                arr[i] = c;
            }else if(chooses==2){
                System.out.println("Enter width");
                int w = Integer.parseInt(scan.nextLine());
                System.out.println("Enter height");
                int h = Integer.parseInt(scan.nextLine());

                Rectangle r = new Rectangle();
                r.width = w;
                r.height = h;
                arr[i] = r;
            }
            else {
                System.out.println("Enter bass");
                int w = Integer.parseInt(scan.nextLine());
                System.out.println("Enter height");
                int h = Integer.parseInt(scan.nextLine());

                Triangle t = new Triangle();
                t.base = w;
                t.height = h;
                arr[i] = t;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].shapeName +": " + arr[i].getArea());
            System.out.println(arr[i]);
        }

    }


    public static void printArea(Shape shape){
        System.out.println(shape.shapeName + " " + shape.getArea());
    }



    public static String print(String msg){
        System.out.println(msg);
        return msg;
    }
}
