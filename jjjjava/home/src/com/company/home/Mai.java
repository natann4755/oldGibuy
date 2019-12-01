package com.company.home;

import java.util.Scanner;

public class Mai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Parson[] pars = new Parson[7];
        for (int i = 1; i < pars.length; i++) {
            Parson p = new Parson();
            p.name = getmas("enter name");
            p.id = getmas("enter id");
            Date d = new Date();
            d.year = Integer.parseInt(getmas("enter yaer"));
            d.month = Integer.parseInt(getmas("enter month"));
            d.dey = Integer.parseInt(getmas("enter dey"));
            p.date = d;
            pars[i] = p;
        }

//        for (; 4 < 5; ) {
//            int bb = Integer.parseInt(getmas("To search by name prees 1 to search by ID prees 2"));
//            if (bb == 1) {
//                String nam = getmas("write name");
//                for (int i = 1; i < pars.length; i++) {
//                    if (pars[i].name.equals(nam)) {
//                        System.out.println(pars[i]);
//                    }
//                }
//            } else {
//                String id = getmas("write ID");
//                for (int i = 1; i < pars.length; i++) {
//                    if (pars[i].id.equals(id)) {
//                        System.out.println(pars[i]);
//                    }
//                }
//            }
//        }
        for (; 4 < 5; ) {
            int ii = Integer.parseInt(getmas("Please choose first name 1-7"));
            int tt = Integer.parseInt(getmas("Please choose secend name 1-7"));
            Parson w = pars[ii];
            Parson t = pars[tt];
            System.out.println(w.howBiggre(t) + "person w" + w.date + "person t" + t.date);
            System.out.println();
        }
    }


//        Parson ii=pars[1];
//        Parson kk = pars [2];
//        System.out.println(ii);
//        System.out.println(kk);
//        System.out.println(ii.howBiggre(kk));

    public static String getmas (String mas){
        Scanner scan = new Scanner(System.in);
        System.out.println(mas);
        return (scan.nextLine());
    }

    }

