package targil;

public class Tractor extends Cars {
    private int kg;

    public Tractor(String name, int prais, int sits, Date date, int kg) {
        super(name, prais, sits, date);
        setKg(kg);
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        if(kg<30&&kg<150){
        this.kg = kg;}
    }
}
