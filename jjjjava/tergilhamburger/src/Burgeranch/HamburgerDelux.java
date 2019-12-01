package Burgeranch;

import java.util.HashMap;

public class HamburgerDelux extends BaisicHamburger {

    HashMap<String,Integer> delux = new HashMap<>(){{
       put("drink",7);
       put("chips",17);
    }};

    public HamburgerDelux(String typebread, String typemeat, Double price) {
        super( "HamburgerDelux", typebread, typemeat, price);
    }
    public void print(){
        System.out.println("drink "+"chips");
        int tot = delux.get("drink")+delux.get("chips");
        System.out.println("delux price: "+ tot);
        System.out.println("burger price: "+ getPrice());
        double total = getPrice()+tot;
        System.out.println("total prich:" + total);
    }

    public void setCorses (String corses1, String corses2, String corses3, String corses4) {
    }

}
