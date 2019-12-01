package t5Printer;

public class Printer {
    private int ink;
    private int Printercounter;
    private boolean Twosided;
    static int ollprinter;

    public Printer(int ink, boolean twosided) {
        if (ink < 0 || ink > 100) {
            System.out.println("Ink values are not correct");
        } else {
            Inkrefill(ink);
            setPrintercounter(0);
            Twosided = twosided;
        }
    }

    public void printer(int column) {
            if (ink < column) {
                System.out.println("Missing ink");
            }
        else {
                ink -= column;
                if (Twosided){
                    column = (column/2)+ (column%2);
                }
                Printercounter+=column;
                ollprinter+=column;
                System.out.println("Pages printed now "+ column + ", Total prints " + Printercounter);
        }
    }


    public int getInk() {
        return ink;
    }

    public void Inkrefill(int ink) {
        if (ink < 0 || ink > 100) {
            System.out.println("Ink values are not correct");
        } else {
            this.ink = ink;
            System.out.println("Ink refill completed successfully, ink level is " + ink);

        }
    }

    public int getPrintercounter() {
        return Printercounter;
    }

    public void setPrintercounter(int printercounter) {
        Printercounter = printercounter;
    }

    public boolean isTwosided() {
        return Twosided;
    }

    public void setTwosided(boolean twosided) {
        Twosided = twosided;
    }

}
