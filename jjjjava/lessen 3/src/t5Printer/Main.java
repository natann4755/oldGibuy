package t5Printer;

public class Main {
    public static void main(String[] args) {
        Printer p =new Printer(0,false);
        p.printer(0);
        System.out.println(p.getPrintercounter());
        p.printer(20);
        p.printer(4);
        p.printer(5);
        p.Inkrefill(50);
        Printer p1= new Printer(10,true);
        p1.printer(10);
        p1.Inkrefill(70);
        p1.printer(70);
        System.out.println("oll printers= " +Printer.ollprinter);
    }
}
