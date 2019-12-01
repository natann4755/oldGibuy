package t3Point;

public class Main {
    public static void main(String[] args) {
        Point p9 = new Point(8,9);
        p9.print();
        Circl c = new Circl(p9,9);
        Circl c2 = new Circl(new Point(3,7),7);
        c.print();

        Circl c3 = new Circl(new Point(7,8),4);
        c3.print();
        c3.chengh(3,2);
        c3.print();
        c3.getP().setX(4);
        System.out.println(c3.getP().getX());


    }
}
