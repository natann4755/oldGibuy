package rrrrrrrrrrr;

import java.util.Scanner;
public class Date {
    int day;
    int month;
    int year;


    public  boolean isLater() {

            Date go = new Date();
            go.day = 22;
            go.month = 03;
            go.year = 1989;
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a date");
            Date d = new Date();
            d.day = Integer.parseInt(scan.nextLine());
            d.month = Integer.parseInt(scan.nextLine());
            d.year = Integer.parseInt(scan.nextLine());
            if (d.year != go.year) {
            return d.year > go.year;}
         else { if (d.month != go.month) {
            return  d.month > go.month;}
         else {
             return d.day> go.day;}


                }
                }








    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';


    }
}





