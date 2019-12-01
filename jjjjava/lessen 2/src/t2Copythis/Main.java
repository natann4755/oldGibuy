package t2Copythis;

public class Main {
    public static void main(String[] args) {
        copyThis c =new copyThis("yoram","ysrael");
        copyThis c1 =new copyThis(c);
        c.print();
        System.out.println();
        c.ching();
        c.print();
        System.out.println();
        c1.print();

    }
}
