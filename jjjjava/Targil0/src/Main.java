import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      String D_n= ToPrint("name of dad");
//        int D_e= Integer.parseInt(ToPrint("ega of dad"));
//        String D_j= ToPrint("jab of dad");
       // Perents dad =new Perents(D_n,D_e,D_j);
       // Perents mam = new Perents("rachel",20,"Doctor");
//        Cids avi = new Cids("avi",15,new Cat("aaa","blue",9));
//        Cids sara = new Cids("sara",15,new Cow("ccc","black",12));
//        Family F1 =new Family(dad,mam,new Cids[]{avi,sara});
//        //F1.tolk();
         Person gg= new Perents("rachel",20,"Doctor");
         Perents pp =(Perents) gg;
         gg.tolk();


//        Family family = NewFamily(ima, aba);
//        family.addKid(moshe);
//
//
//
//        family.talk();
//        family.play()

    }

    public static String ToPrint (String msg){
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        return scan.nextLine();
    }
}
