package com.company;

import Burgeranch.BaisicHamburger;
import Burgeranch.HamburgerDelux;
import Burgeranch.HelthyHamburger;

public class Main {

    public static void main(String[] args) {
        BaisicHamburger a = new BaisicHamburger("base","write","chicen",48.5);
        a.setCorses("egg", "saled", "eggplant", "frid onyen");
        a.print();
        HelthyHamburger b =new HelthyHamburger("6",60.0);
        b.setCorses("onyen","tomato","onyen","tomato");
        b.print();
        HamburgerDelux c=new HamburgerDelux("write","9",60.9);
        c.setCorses("onyen","tomato","onyen","tomato");
        c.print();
    }
}
