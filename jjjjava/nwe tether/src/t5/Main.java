package t5;

public class Main {
    public static void main(String[] args) {
        int [][] cefel = new int[13][13];

        for (int o = 0; o <cefel.length ; o++) {
            for (int sh = 0; sh <cefel[8].length ; sh++) {
                cefel[o][sh]= o*sh;
            }
        }

        for (int i =0; i <cefel.length ; i++) {
            for (int j = 0; j <cefel[0].length ; j++) {
                System.out.print(cefel[i][j]+"\t");

            }
            System.out.println();

        }


    }
}
