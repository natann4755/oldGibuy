package Colors;

public class Main {

    public static void main(String[] args) {
        int x = 900;
        Color c = new Color();
        c.red = 255;

        System.out.println("x = " + x);
        System.out.println(c);

        System.out.println("Change values");
        System.out.println();
        changeInt(x);
        changeColor(c);

        System.out.println("x = " + x);
        System.out.println(c);

        Person p1 = new Person("A", "B");
        Person p2 = p1;
        p1.setName("B");
        System.out.println(p1);
        System.out.println(p2);
    }

    public static void changeInt(int x){
        x = -1;

    }

    public static void changeColor(Color c){
      //  c = new Color();
        c.blue = -1;
        c.green = -1;
        c.red = -1;
        System.out.println(c);
    }
}
