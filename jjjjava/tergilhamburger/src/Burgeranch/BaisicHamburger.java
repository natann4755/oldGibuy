package Burgeranch;

import java.util.HashMap;

public class BaisicHamburger {
    private String typeHamburger;
    private String typebread;
    private String typemeat;
    private Double price;
    private String [] corses = new String[4];


    HashMap <String,Double> extension = new HashMap<>(){{
        put("chips",4.5);
        put("egg",2.0);
        put("tomato",1.5);
        put("beens",7.0);
        put("saled",8.0);
        put("onyen",7.5);
        put("eggplant",5.5);
        put("olivse",8.0);
        put("frid onyen",5.8);
    }};



    public BaisicHamburger(String typeHamburger, String typebread, String typemeat, Double price) {
        setTypeHamburger(typeHamburger);
        setTypebread(typebread);
        setTypemeat(typemeat);
        setPrice(price);
    }

     public void print(){
            for (int i = 0; i <corses.length ; i++) {
                System.out.print("-"+corses[i]+"-");
            }
         System.out.println();
            double corsesPrice=0;
            for (int i = 0; i <corses.length ; i++){
                corsesPrice+= extension.get(corses[i]);
            }
            System.out.println("Besic price extensions: "+corsesPrice);
            System.out.println("burger price: "+ price);
            double total = price+corsesPrice;
            System.out.println("total prich:" + total);
        }


    public String getTypeHamburger() {
        return typeHamburger;
    }

    public void setTypeHamburger(String typeHamburger) {
        this.typeHamburger = typeHamburger;
    }

    public String getTypebread() {
        return typebread;
    }

    public void setTypebread(String typebread) {
        this.typebread = typebread;
    }

    public String getTypemeat() {
        return typemeat;
    }

    public void setTypemeat(String typemeat) {
        this.typemeat = typemeat;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String[] getCorses() {
        return corses;
    }

    public void setCorses(String corses1, String corses2, String corses3, String corses4) {
        corses[0]=corses1;
        corses[1]=corses2;
        corses[2]=corses3;
        corses[3]=corses4;
    }
}
