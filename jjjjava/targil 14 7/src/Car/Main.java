package Car;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        for (int i = 0; i < c.cars.length; i++) {
            Random random = new Random();
            c.cars[i]=new Car();
            int nam = random.nextInt(29);
            c.cars[i].age =1990+nam;
            c.cars[i].number = random.nextInt(100000000)+9999999;
            c.cars[i].colore = c.colors[random.nextInt(4)];
            c.cars[i].company = c.companys[random.nextInt(4)];
        }
        for (; 5<6;) {
            int chose = Integer.parseInt(msg("To the list of cars press 1"+ "\n" + "To a person by company press 2" + "\n" + "To a person by ega press 3"));
            if (chose==1){
                for (int i = 0; i <c.cars.length;i++) {
                    System.out.println(c.cars[i]);
                }
            }
            if (chose==2) {
                String mas = msg("plis rite company");
                for (int i = 0; i <c.cars.length; i++) {
                    if (mas.equals(c.cars[i].company)) {
                        System.out.println(c.cars[i]);
                    }
                }
            }
            if (chose==3){
                int age = Integer.parseInt(msg("plis rite ega (1990-2019)"));
                for (int j = 0; j <c.cars.length ; j++) {
                    if (age==c.cars[j].age){
                        System.out.println(c.cars[j]);
                    }
                }
            }
        }

    }

    public static String msg (String s){
        Scanner scan = new Scanner(System.in);
        System.out.println(s);
        return scan.nextLine();
    }
}
