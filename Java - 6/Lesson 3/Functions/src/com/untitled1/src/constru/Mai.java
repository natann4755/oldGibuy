package constru;

public class Mai {

    public static void main(String[] args) {
        Date d = new Date(1, 1, 1980);
        System.out.println(d);

        Person p = new Person("Avi", "Cohen", 900, d);
        System.out.println(p);

        Person p2 = new Person();
        System.out.println(p2);

        Date tt = new Date(1900);
        System.out.println(tt);

        Person p9;
    }
}
