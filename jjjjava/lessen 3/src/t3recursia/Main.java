package t3recursia;

public class Main {
    public static void main(String[] args) {
        int i =3;
        recursia(i);
    }
    public static void recursia(int i){
        if (i <1) {
            return;
        }
        else {
            recursia(i-1);
            System.out.println(i);

        }
    }
}
