package Shape;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
            Random rr = new Random();
            int num = rr.nextInt(2);
            if (num==1){
                System.out.println(num);
                rectangel r =new rectangel("rectangel",5,5);
                System.out.println(r.getArea());
                System.out.println(r.getPerimeter());
            }
            else {
                System.out.println(num);
                circl c = new circl("circel",3.5);
                System.out.println(c.getArea());
                System.out.println(c.getPerimeter());
            }

    }
}
