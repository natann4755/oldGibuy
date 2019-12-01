package t4aztertrecusia;

public class Main {
    public static void main(String[] args) {
        int r =4;
        int rr=  rrr (r);
        System.out.println(rr);
    }
    public static int rrr (int n){
        if (n==1) {
            return 1;
        }
        else {
            return n * rrr(n - 1);
        }
    }
}
