package Burgeranch;

import java.util.HashMap;

public class HelthyHamburger extends BaisicHamburger {

    HashMap<String,Integer> helthyExtension = new HashMap<>(){{
       put("lettuce",8);
       put("Sprouts",5);
    }};

    public HelthyHamburger(String typemeat, Double price) {
        super("helthy", "brown bred", typemeat, price);
    }

    public void print(){
        for (int i = 0; i <getCorses().length ; i++) {
            System.out.print("-"+getCorses()[i]+"-");
        }
        System.out.println();
        int totel = helthyExtension.get("lettuce")+helthyExtension.get("Sprouts");
        System.out.println("Helthy price extensions: "+totel);
        double corsesPrice=0;
        for (int i = 0; i <getCorses().length ; i++){
            corsesPrice+= extension.get(getCorses()[i]);
        }
        System.out.println("Besic price extensions: "+corsesPrice);
        System.out.println("burger price: "+ getPrice());
        double tot = getPrice()+corsesPrice+totel;
        System.out.println("total prich:" + tot);
    }

}
