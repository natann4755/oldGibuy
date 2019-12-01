package setGet;

public class Main {

    public static void main(String[] args) {
        Date d = new Date(20, 2, 2000);
        Date d2 = new Date(20, 02, 1990);
        if(d.getDay() == d2.getDay()){
            System.out.println(d);
        }

    }
}
