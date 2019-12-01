package ss;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Worker [] Worcers = new Worker[10];
//        Worker [] Worcers2 = new Worker[2];
//        Worker a =new Worker("aaa","111",1000);
//        Worker b =new Worker("bbb","222",2000);
//        Worker c =new Worker("ccc","333",3000);
//        Worker d =new Worker("ddd","444",4000);
//        Worcers1 [0]= a;
//        Worcers1 [1] =b;
//        Worcers1 [2] =c;
//        Worcers1 [3] =d;


        Manager [] managers =new Manager[2];
        for (int i = 0; i <managers.length ; i++) {
            Random random = new Random();
            int num = random.nextInt(3)+1;
            System.out.println("random =" +num);
            Worker[] ww = new Worker[num];
            for (int j = 0; j < num; j++) {
                String n = mas("enter name for wo" + j );
                String id = mas("enter id for wo" + j );
                int s = Integer.parseInt(mas("enter salary for wo" + j ));
                ww[j] = new Worker(n, id, s);
            }
                String mn = mas("enter name for me" + i);
                String mid = mas("enter id for me" + i);
                int ms = Integer.parseInt(mas("enter salary for me" + i));
               managers[i]= new Manager(mn, mid, ms, ww);
            }
        String bn = mas("enter name for  big maneger");
        String bid = mas("enter id for big maneger");
        int bs = Integer.parseInt(mas("enter salary for big maneger"));
        ceo bigmaneger= new ceo(bn,bid,bs,managers);
        bigmaneger.print();
        bigmaneger.printManeger();

        }


    public static String mas (String mmass){
        Scanner scan = new Scanner(System.in);
        System.out.println(mmass);
        return scan.nextLine();
    }
}
