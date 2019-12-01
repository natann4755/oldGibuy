package Shiluv;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Car x =new Car();
        for (int i = 0; i < x.carss.length; i++) {
            Random random = new Random();
            int nam = random.nextInt(29);
            x.carss[i]=new Car();
            x.carss[i].age =1990+nam;
            x.carss[i].number = random.nextInt(100000000)+9999999;
            x.carss[i].colore = x.colors[random.nextInt(4)];
            x.carss[i].company = x.companys[random.nextInt(4)];
        }

        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            String Fnam = mmsg("plis rite first name for " + i);
            String Lnam = mmsg("plis rite last name for " + i);
            int age = Integer.parseInt(mmsg("plis rite age for " + i));
            String id = mmsg("plis rite id for " + i);
            for (int j = 0; j < persons.size(); j++) {
                if (id.equals(persons.get(j).getId())) {
                    i--;
                    System.out.println("this id is not rite, rite egan oll person!");
                }
            }
            persons.add(new Person(Fnam, Lnam, age, id));
        }
            int number = Integer.parseInt(mmsg("plis rite number form car"));
            String perso = mmsg("plis rite id form person");

                for (int i = 0; i <x.carss.length ; i++) {
                    if (number == x.carss[i].number) {
                        if (x.carss[i].nameOfPerson == null) {
                            for (int j = 0; j < persons.size(); i++) {
                                if (perso.equals(persons.get(j).getId())) {
                                    if (persons.get(j).carsPerson.size()==3){
                                        continue;
                                    }
                                    else {
                                        persons.get(j).carsPerson.add(x.carss[i]);
                                        x.carss[i].nameOfPerson = persons.get(j);
                                    }
                                }
                            }
                        }
                        else {
                            System.out.println("car used try egen");
                        }
                    }
                }

        //int chose = Integer.parseInt(msg("To the list of people press 1"+ "\n" + "To a person by name press 2" + "\n" + "To a person by name press 3"));



    }
    public static String mmsg (String s){
        Scanner scan = new Scanner(System.in);
        System.out.println(s);
        return scan.nextLine();
    }
}
