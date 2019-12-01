package t4;

public class Main {
    public static void main(String[] args) {
        double [] dd ={10,9,8,7.5,6.7,5.5,6.0};
            double f = 0;
        for (int i = 0; i < dd.length ; i++) {
             f +=dd[i];
        }
        System.out.println(f/dd.length);
    }
}
